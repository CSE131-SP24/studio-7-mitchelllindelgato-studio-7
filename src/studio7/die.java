package studio7;

public class die {
int sides;

public die(int n) {
sides = n;
}
public int roll()
{
	return (int)(Math.random()*sides+1);
}
}
