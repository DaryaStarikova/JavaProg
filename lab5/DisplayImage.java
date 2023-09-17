package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DisplayImage extends JFrame {

    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            // Загрузка изображения из указанного пути
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Установка размеров окна равными размерам изображения
        setSize(image.getWidth(), image.getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Image Display");

        // Создание панели для отображения изображения
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }
        };

        // Добавление панели на окно
        add(panel);

        // Установка видимости окна
        setVisible(true);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DisplayImage <image_path>");
            return;
        }

        SwingUtilities.invokeLater(() -> {
            new DisplayImage(args[0]);
        });
    }
}

