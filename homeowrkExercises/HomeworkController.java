package homeowrkExercises;

public class HomeworkController extends ExerciseController {
	
	Homework Hwk = new Homework();
	
	public HomeworkController(IView theView) {
		super(theView);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doStuff() {
		// TODO Auto-generated method stub
		myView.say("Exercise One: " + Hwk.CheckMark());
		myView.say("Exercise Two: " + Hwk.CheckNumber());
		myView.say("Exercise Three: " + Hwk.PrintWord());
		myView.say("Exercise Four: " + Hwk.SumAndAverage());
		myView.say("Exercise Five: " + Hwk.DoWhile());
		myView.say("Exercise Six: " + Hwk.WhileDo());
		myView.say("Exercise Six: " + Hwk.OnlyOdd());
		myView.say("Exercise Six: " + Hwk.DivideSevens());
		myView.say("Exercise Six: " + Hwk.SumOfSquares());
		
		myView.say("Now Leaving Exercises 1 to 10. Now Entering Exercises 11 to 20");
		
		myView.say("Exercise Six: " + Hwk.Product1toN());
		myView.say("Exercise Six: " + Hwk.WhileDo());
		
		myView.say("");
		myView.say(Hwk.Testing());
	}
}
