package asm.com.sun.xml.bind.v2.model.impl;
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
public class ClassInfoImpl$PropertySorter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter$1", "Ljava/util/AbstractList<Ljava/lang/String;>;", "java/util/AbstractList", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter", "checkUnusedProperties", "()V");

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter", "com/sun/xml/bind/v2/model/impl/ClassInfoImpl", "PropertySorter", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter$1", "this$1", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractList", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter$1", "this$1", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter", "this$0", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl", "access$200", "(Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;)Lcom/sun/istack/FinalArrayList;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/istack/FinalArrayList", "get", "(I)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/impl/PropertyInfoImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/PropertyInfoImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter$1", "this$1", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter", "this$0", "Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl", "access$200", "(Lcom/sun/xml/bind/v2/model/impl/ClassInfoImpl;)Lcom/sun/istack/FinalArrayList;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/istack/FinalArrayList", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/model/impl/ClassInfoImpl$PropertySorter$1", "get", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
