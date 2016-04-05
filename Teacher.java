public class Teacher {
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;
    //住址
    private String addr;
    
    private void setAddr(String addr) {
        this.addr = addr;
    }
    
    public String getAddr() {
        return addr;
    }
    
    
    
    private void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    private void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    private void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getSex() {
        return sex;
    }
}