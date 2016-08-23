import org.activiti.engine.RuntimeService;
public class hw{
    private RuntimeService runtimeService;
    public static void main(String args[]){
        System.out.println("HW java");
    }
    public void testRuntime(){
        runtimeService.createExecutionQuery().activityId("1");
    }
}