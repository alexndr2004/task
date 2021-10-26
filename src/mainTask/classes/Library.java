package mainTask.classes;

import java.util.List;

public class Library {
    public static void main(String[] args) {

        LibrarySection librarySection = new LibrarySection("Fantasy");

        librarySection.addBook(new Book("Java Библиотека профессионала. Том 1. Основы", "Хорстманн К.", "Вильямс", 2017, "твёрдый"));
        librarySection.addBook(new Book("Как научится решать задачи", "Фридман Л. Турецкий Е.", "Просвещение", 1984, "твёрдый"));
        librarySection.addBook(new Book("Программирование на языке высокого уровня ", "Немцова Т. Голова С. Терентьев А.", "Форум", 2016, "твёрдый"));
        librarySection.addBook(new Book("Hamlet", "Shakespeare W.", "Penguin Books", 1994, "мягкий"));
        librarySection.addBook(new Book("Отягощение Злом или Сорок лет спустя", "Стругацкий А. Стругацкий Б.", "Прометей", 1989, "твёрдый"));
        librarySection.addBook(new Book("Изгнание беса", "Столяров А.", "Прометей", 1989, "твёрдый"));
        librarySection.addBook(new Book("Повести. Ревизор", "Гоголь Н.", "Художественная литература", 1984, "мякгий"));
        librarySection.addBook(new Book("Бегущая по волнам", "Грин А.", "Художественная литература", 1988, "мягкий"));
        librarySection.addBook(new Book("10 Best Stories", "Henry O.", "Эксмо", 2013, "мягкий"));
        librarySection.addBook(new Book("451 градус по Фаренгейту", "Брэдбери Р.", "Тернополь Богдан", 2019, "твёрдый"));

        List<Book> listBooksByAuthor = librarySection.getBookListByAuthor("Хорстманн К.");
        listBooksByAuthor.forEach(System.out::println);

        List<Book> listBooksByPublishingHouse = librarySection.getBookListByPublishingHouse("Художественная литература");
        listBooksByPublishingHouse.forEach(System.out::println);

        List<Book> listBooksAfterThisYear = librarySection.getBookListAfterYear(2000);
        listBooksAfterThisYear.forEach(System.out::println);

    }
}