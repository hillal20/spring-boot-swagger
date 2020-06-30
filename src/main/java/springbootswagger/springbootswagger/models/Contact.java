package springbootswagger.springbootswagger.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "create objects containing the info one person ") // for swagger
public class Contact  {

    @ApiModelProperty(notes = "id of the person") // for swagger
    private int id;
    @ApiModelProperty(notes = "name of the person") // for swagger
    private String name;
    @ApiModelProperty(notes = "address  of the person") // for swagger
    private String add;



    public Contact() {
        super();
    }


    /**
     * @param id   it is an id for the contact
     * @param name name of the contact
     * @param add address of the contact
     */
    public Contact(int id, String name, String add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    /**
     *
     * @return int the person id
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    /***
     * just adding
     * @param add
     */
    public void setAdd(String add) {
        this.add = add;
    }

    /**
     *
     * @return String ans abject detail with the strings
     */
    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
