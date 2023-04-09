package model;

import java.util.Objects;

public class groceryItem
{
	String name;
	double cost;
	
	/**
	 * @param name
	 * @param cost
	 */
	public groceryItem(String name, double cost)
	{
		super();
		this.name = name;
		this.cost = cost;
	}
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}
	
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	//useful in testing!
	@Override
	public int hashCode()
	{
		return Objects.hash(cost, name);
	}
	
	//useful in testing!
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		groceryItem other = (groceryItem) obj;
		return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && Objects.equals(name, other.name);
	}
	
	//displayed in list view
	@Override
	public String toString()
	{
		return name + " : " + cost;
	}
}
