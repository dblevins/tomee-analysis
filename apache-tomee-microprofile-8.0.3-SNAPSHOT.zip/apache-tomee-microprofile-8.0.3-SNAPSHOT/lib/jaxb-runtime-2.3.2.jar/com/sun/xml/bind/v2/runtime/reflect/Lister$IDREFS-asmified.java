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
public class Lister$IDREFSDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "<BeanT:Ljava/lang/Object;PropT:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/runtime/reflect/Lister<TBeanT;TPropT;Ljava/lang/String;Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS<TBeanT;TPropT;>.Pack;>;", "com/sun/xml/bind/v2/runtime/reflect/Lister", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "com/sun/xml/bind/v2/runtime/reflect/Lister", "IDREFS", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack", "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "Pack", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFSIterator", "com/sun/xml/bind/v2/runtime/reflect/Lister", "IDREFSIterator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/reflect/Lister$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Lister;", "Lcom/sun/xml/bind/v2/runtime/reflect/Lister<TBeanT;TPropT;Ljava/lang/Object;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "itemType", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Lister", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Lister;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "itemType", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator;", "(TPropT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Lister;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister", "iterator", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFSIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFSIterator", "<init>", "(Lcom/sun/xml/bind/v2/runtime/reflect/ListIterator;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/reflect/Lister$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startPacking", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack;", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TPropT;>;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS<TBeanT;TPropT;>.Pack;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack", "<init>", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addToPack", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack;Ljava/lang/String;)V", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS<TBeanT;TPropT;>.Pack;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack", "add", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endPacking", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS<TBeanT;TPropT;>.Pack;TBeanT;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TPropT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", "(TBeanT;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor<TBeanT;TPropT;>;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Lister;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister", "reset", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "endPacking", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "endPacking", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack;Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addToPack", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "addToPack", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack;Ljava/lang/String;)V", false);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "startPacking", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/reflect/Accessor;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS$Pack;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS;)Lcom/sun/xml/bind/v2/runtime/reflect/Lister;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "core", "Lcom/sun/xml/bind/v2/runtime/reflect/Lister;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lcom/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/reflect/Lister$IDREFS", "itemType", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
