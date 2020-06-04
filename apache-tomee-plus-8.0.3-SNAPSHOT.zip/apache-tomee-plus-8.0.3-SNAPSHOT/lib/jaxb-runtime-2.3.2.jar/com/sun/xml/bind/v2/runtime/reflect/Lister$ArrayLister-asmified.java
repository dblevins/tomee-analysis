package asm.com.sun.xml.bind.v2.runtime.reflect;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class Lister$ArrayListerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "<BeanT:Ljava/lang/Object;ItemT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/runtime/reflect/Lister<TBeanT;[TItemT;TItemT;Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack<TItemT;>;>;", "com/sun/xml/bind/v2/runtime/reflect/Lister", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "com/sun/xml/bind/v2/runtime/reflect/Lister", "ArrayLister", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister$1", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$Pack", "com/sun/xml/bind/v2/runtime/reflect/Lister", "Pack", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "itemType", "Ljava/lang/Class;", "Ljava/lang/Class<TItemT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<TItemT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Lister", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "itemType", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "([Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator;", "([TItemT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator<TItemT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister$1", "<init>", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startPacking", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;[TItemT;>;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Lister$Pack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "itemType", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$Pack", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToPack", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;Ljava/lang/Object;)V", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack<TItemT;>;TItemT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$Pack", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endPacking", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack<TItemT;>;TBeanT;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;[TItemT;>;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$Pack", "build", "()[Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;[TItemT;>;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "itemType", "Ljava/lang/Class;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "newInstance", "(Ljava/lang/Class;I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Accessor", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "endPacking", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/reflect/Lister$Pack");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "endPacking", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addToPack", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/reflect/Lister$Pack");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "addToPack", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "startPacking", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)Ljava/lang/Object;", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "startPacking", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister$Pack;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "iterator", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$ArrayLister", "iterator", "([Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
