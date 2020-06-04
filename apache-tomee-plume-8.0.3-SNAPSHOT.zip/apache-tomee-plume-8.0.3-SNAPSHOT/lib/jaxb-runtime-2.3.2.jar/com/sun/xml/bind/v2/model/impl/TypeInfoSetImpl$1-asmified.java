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
public class TypeInfoSetImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/TypeInfoSetImpl$1", "Ljava/lang/Object;Ljava/lang/Iterable<Lcom/sun/xml/bind/v2/model/impl/ElementInfoImpl<TT;TC;TF;TM;>;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/TypeInfoSetImpl", null, null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/TypeInfoSetImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/bind/v2/model/impl/TypeInfoSetImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/TypeInfoSetImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/TypeInfoSetImpl$1", "this$0", "Lcom/sun/xml/bind/v2/model/impl/TypeInfoSetImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lcom/sun/xml/bind/v2/model/impl/ElementInfoImpl<TT;TC;TF;TM;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/util/FlattenIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/impl/TypeInfoSetImpl$1", "this$0", "Lcom/sun/xml/bind/v2/model/impl/TypeInfoSetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/model/impl/TypeInfoSetImpl", "access$000", "(Lcom/sun/xml/bind/v2/model/impl/TypeInfoSetImpl;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/util/FlattenIterator", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
