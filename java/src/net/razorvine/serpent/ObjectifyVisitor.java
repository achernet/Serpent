/**
 * Serpent, a Python literal expression serializer/deserializer
 * (a.k.a. Python's ast.literal_eval in Java)
 * Software license: "MIT software license". See http://opensource.org/licenses/MIT
 * @author Irmen de Jong (irmen@razorvine.net)
 */

package net.razorvine.serpent;

import java.util.Stack;
import net.razorvine.serpent.ast.*;


public class ObjectifyVisitor implements INodeVisitor
{
	Stack<Object> generated = new Stack<Object>();
	
	/**
	 * get the resulting object tree.
	 */
	public Object getObject()
	{
		return generated.pop();
	}

	public void visit(ComplexNumberNode complex) {
		// TODO Auto-generated method stub
		
	}

	public void visit(DictNode dict) {
		// TODO Auto-generated method stub
		
	}

	public void visit(ListNode list) {
		// TODO Auto-generated method stub
		
	}

	public void visit(NoneNode none) {
		// TODO Auto-generated method stub
		
	}

	public void visit(IntegerNode value) {
		// TODO Auto-generated method stub
		
	}

	public void visit(LongNode value) {
		// TODO Auto-generated method stub
		
	}

	public void visit(DoubleNode value) {
		// TODO Auto-generated method stub
		
	}

	public void visit(BooleanNode value) {
		// TODO Auto-generated method stub
		
	}

	public void visit(StringNode value) {
		// TODO Auto-generated method stub
		
	}

	public void visit(SetNode setnode) {
		// TODO Auto-generated method stub
		
	}

	public void visit(TupleNode tuple) {
		// TODO Auto-generated method stub
		
	}
	
}

/***
namespace Razorvine.Serpent
{
	/// <summary>
	/// Ast nodevisitor that turns the AST into actual Java objects (array, int, IDictionary, string, etc...)
	/// </summary>
	public class ObjectifyVisitor: Ast.INodeVisitor
	{
		private Stack<object> generated;
		
		public ObjectifyVisitor()
		{
			generated = new Stack<object>();
		}
		
		public object GetObject()
		{
			return generated.Pop();
		}
		
		public void Visit(Ast.ComplexNumberNode complex)
		{
			generated.Push(new ComplexNumber(complex.Real, complex.Imaginary));
		}
		
		public void Visit(Ast.DictNode dict)
		{
			IDictionary<object, object> obj = new Dictionary<object, object>(dict.Elements.Count);
			foreach(Ast.KeyValueNode kv in dict.Elements)
			{
				kv.Key.Accept(this);
				object key = generated.Pop();
				kv.Value.Accept(this);
				object value = generated.Pop();
				obj[key] = value;
			}
			generated.Push(obj);
		}
		
		public void Visit(Ast.ListNode list)
		{
			IList<object> obj = new List<object>(list.Elements.Count);
			foreach(Ast.INode node in list.Elements)
			{
				node.Accept(this);
				obj.Add(generated.Pop());
			}
			generated.Push(obj);
		}
		
		public void Visit(Ast.NoneNode none)
		{
			generated.Push(null);
		}
		
		public void Visit(Ast.IntegerNode value)
		{
			generated.Push(value.Value);
		}
		
		public void Visit(Ast.LongNode value)
		{
			generated.Push(value.Value);
		}
		
		public void Visit(Ast.DoubleNode value)
		{
			generated.Push(value.Value);
		}
		
		public void Visit(Ast.BooleanNode value)
		{
			generated.Push(value.Value);
		}
		
		public void Visit(Ast.StringNode value)
		{
			generated.Push(value.Value);
		}
		
		public void Visit(Ast.DecimalNode value)
		{
			generated.Push(value.Value);
		}
		
		public void Visit(Ast.SetNode setnode)
		{
			HashSet<object> obj = new HashSet<object>();
			foreach(Ast.INode node in setnode.Elements)
			{
				node.Accept(this);
				obj.Add(generated.Pop());
			}
			generated.Push(obj);
		}
		
		public void Visit(Ast.TupleNode tuple)
		{
			object[] array = new object[tuple.Elements.Count];
			int index=0;
			foreach(Ast.INode node in tuple.Elements)
			{
				node.Accept(this);
				array[index++] = generated.Pop();
			}
			generated.Push(array);
		}
	}
}
***/
