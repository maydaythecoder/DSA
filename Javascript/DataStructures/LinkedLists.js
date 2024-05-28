class Node {
    constructor(data, next = null){
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor(){
        this.head = null;
        this.size = 0;
    }



//insert first Node
    insertFirst(data) {
        this.head = new Node(data, this.head);
        this.size++;
    }



//Insert last Node
    insertLast(data) {
        let node = new Node(data);
        let current;
//if LinkedList is empty, make this the Head
        if(!this.head) {
            this.head = node;
        } else {
            current = this.head;

            while(current.next){
                current = current.next
            }
            current.next = node;
        }
        this.size++;
    }




//Insert at Index
    insertAt(data,index) {
//If index is out of range
        if(index > 0 && index > this.size){
            return;
        }
//If first index
        if (index === 0){
            this.head = new Node(data, this.head);
            this.size++;
            return;
        }

        const node = new Node(data);
        let current, previous;
//set current to first
        current = this.head;
        let count = 0;

        while (count < index){
            previous = current;//node before index
            count++;
            current = current.next//node after index
        }

        node.next = current;
        previous.next = node;
        this.size++;
    }



    //Get at Index
    getAt(index){
        let current = this.head;
        let count = 0;

        while (current) {
            if((count == index)){
                console.log(current.data);
            }
            count++;
            current = current.next;
        }

        return null;
    }



//Remove at Index
    removeAt(index){
        if(index > 0 && index > this.size){
            return;
        }
        let current = this.head;
        let previous;
        let count = 0;
//remove first
        if(index === 0){
            this.head = current.next;
        }else{
            while(count < index) {
                count++;
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        this.size--;
    }



    //Clear List
    clearList() {
        this.head = null;
        this.size = 0;
    }



    //Print List data
    PrintListdata(){
        let current = this.head;

        while(current) {
            console.log(current.data);
            current = current.next;
        }
    }
}

const LinkedListOne = new LinkedList();


LinkedListOne.insertFirst(100);
LinkedListOne.insertFirst(200);
LinkedListOne.insertFirst(300);
LinkedListOne.insertLast(400);
LinkedListOne.insertAt(500,2);
LinkedListOne.insertAt(600,0);
//LinkedListOne.insertAt(700,10);//test edge case
// LinkedListOne.PrintListdata();

// LinkedListOne.removeAt(2);
//LinkedListOne.PrintListdata();

//LinkedListOne.getAt(2);
// LinkedListOne.getAt(3);
// LinkedListOne.getAt(10);//test edge case

//LinkedListOne.clearList();
//LinkedListOne.PrintListdata();