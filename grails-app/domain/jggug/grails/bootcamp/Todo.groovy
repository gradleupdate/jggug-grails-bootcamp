package jggug.grails.bootcamp

class Todo {

    String content

    static constraints = {
        content blank: false, maxSize: 20
    }
}
