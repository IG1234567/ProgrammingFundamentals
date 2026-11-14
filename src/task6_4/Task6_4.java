package task6_4;

import java.io.File;
import java.util.Scanner;

public class Task6_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Ask the user to enter a directory path
        System.out.print("Enter directory path: ");
        String directoryPath = in.nextLine();

        File directory = new File(directoryPath);

        // Check whether the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Error: The specified directory does not exist.");
            in.close();
            return;
        }

        // Calculate total directory size
        long totalSizeInBytes = calculateDirectorySize(directory);

        double totalSizeInKB = totalSizeInBytes / 1024.0;
        double totalSizeInMB = totalSizeInBytes / (1024.0 * 1024.0);

        // Display total size
        System.out.println("\nTotal size of directory: " + directoryPath);

        System.out.printf("Bytes: %d%n", totalSizeInBytes);
        System.out.printf("Kilobytes: %.2f KB%n", totalSizeInKB);
        System.out.printf("Megabytes: %.2f MB%n", totalSizeInMB);

        // Display individual directory sizes
        System.out.println("\nIndividual directory sizes:");

        displayDirectorySizes(directory, 0);

        in.close();
    }

    // Recursive method to calculate directory size
    private static long calculateDirectorySize(File directory) {

        long size = 0;

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isFile()) {
                    size += file.length();

                } else if (file.isDirectory()) {
                    size += calculateDirectorySize(file);
                }
            }
        }

        return size;
    }

    // Recursive method to display each directory size
    private static void displayDirectorySizes(File directory, int level) {

        long size = calculateDirectorySize(directory);

        double sizeKB = size / 1024.0;
        double sizeMB = size / (1024.0 * 1024.0);

        // Indentation shows directory hierarchy
        String indent = "  ".repeat(level);

        System.out.printf(
            "%s%s: %d bytes | %.2f KB | %.2f MB%n",
            indent,
            directory.getName(),
            size,
            sizeKB,
            sizeMB
        );

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isDirectory()) {
                    displayDirectorySizes(file, level + 1);
                }
            }
        }
    }
}
