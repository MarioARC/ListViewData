package com.example.testapp;

import android.util.Log;

public class Stack {
    private Node head, tail;

    public Stack()
    {
        head = null;
        tail = null;
    }

    public void pushFirst(String addData)
    {
        Node newNode = new Node(addData);
        if(head == null)
        {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else
        {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }
    }

    public void pushLast(String addData)
    {
        Node newNode = new Node(addData);
        if(head == null)
        {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void popFirst()
    {
        if(head != null)
        {
            if(head.next == null)
            {
                head = null;
                tail = null;
            }
            else
            {
                head = head.next;
                head.previous = null;
            }
        }
        else
        {
            Log.i("PopFirst", "Delete from an empty list?");
            System.exit(0);
        }
    }

    public void popLast()
    {
        if(tail != null)
        {
            if(tail.previous == null)
            {
                tail = null;
                head = null;
            }
            else
            {
                tail = tail.previous;
                tail.next = null;
            }
        }
        else
        {
            Log.i("PopLast", "Delete from an empty list?");
            System.exit(0);
        }
    }

    public String peekFirst()
    {
        if(head != null)
        {
            return head.getData() + "";
        }
        else
        {
            Log.i("PeekFirst","List is empty");
            return null;
        }
    }

    public String peekLast()
    {
        if(tail != null)
        {
            return tail.getData() + "";
        }
        else
        {
            Log.i("PeekLast","List is empty");
            return null;
        }
    }

    public int length()
    {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.next;
        }
        return count;
    }

    public void showList()
    {
        Node position = head;
        if(head == null)
        {
            Log.i("ShowList","List is empty");
            return;
        }
        while(position != null)
        {
            Log.i("ShowList",position.getData() + " ");
            position = position.next;
        }
    }

    private class Node
    {
        private String data;
        Node previous;
        Node next;

        public Node(String data)
        {
            this.data = data;
        }

        public String getData()
        {
            return data;
        }
    }
}
