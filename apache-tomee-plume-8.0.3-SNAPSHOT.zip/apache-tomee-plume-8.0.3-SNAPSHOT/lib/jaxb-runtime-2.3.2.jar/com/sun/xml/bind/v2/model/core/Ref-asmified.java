package asm.com.sun.xml.bind.v2.model.core;
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
public class RefDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/model/core/Ref", "<T:Ljava/lang/Object;C:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "type", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "adapter", "Lcom/sun/xml/bind/v2/model/core/Adapter;", "Lcom/sun/xml/bind/v2/model/core/Adapter<TT;TC;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "valueList", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/core/Ref", "<init>", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/core/Adapter;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/core/Adapter;Z)V", "(TT;Lcom/sun/xml/bind/v2/model/core/Adapter<TT;TC;>;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/core/Ref", "adapter", "Lcom/sun/xml/bind/v2/model/core/Adapter;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/core/Adapter", "defaultType", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/xml/bind/v2/model/core/Ref", "java/lang/Object", "com/sun/xml/bind/v2/model/core/Adapter", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/core/Ref", "type", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/core/Ref", "valueList", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/ModelBuilderI;Ljava/lang/Object;Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;Ljavax/xml/bind/annotation/XmlList;)V", "(Lcom/sun/xml/bind/v2/model/impl/ModelBuilderI<TT;TC;**>;TT;Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;Ljavax/xml/bind/annotation/XmlList;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/ModelBuilderI", "getReader", "()Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/impl/ModelBuilderI", "getNavigator", "()Lcom/sun/xml/bind/v2/model/nav/Navigator;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/core/Ref", "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;Lcom/sun/xml/bind/v2/model/nav/Navigator;Ljava/lang/Object;Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;Ljavax/xml/bind/annotation/XmlList;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;Lcom/sun/xml/bind/v2/model/nav/Navigator;Ljava/lang/Object;Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;Ljavax/xml/bind/annotation/XmlList;)V", "(Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader<TT;TC;**>;Lcom/sun/xml/bind/v2/model/nav/Navigator<TT;TC;**>;TT;Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;Ljavax/xml/bind/annotation/XmlList;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/core/Adapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/core/Adapter", "<init>", "(Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;Lcom/sun/xml/bind/v2/model/annotation/AnnotationReader;Lcom/sun/xml/bind/v2/model/nav/Navigator;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/core/Adapter", "defaultType", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"com/sun/xml/bind/v2/model/core/Ref", "com/sun/xml/bind/v2/model/annotation/AnnotationReader", "com/sun/xml/bind/v2/model/nav/Navigator", "java/lang/Object", "javax/xml/bind/annotation/adapters/XmlJavaTypeAdapter", "javax/xml/bind/annotation/XmlList", "com/sun/xml/bind/v2/model/core/Adapter"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/core/Ref", "type", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/core/Ref", "adapter", "Lcom/sun/xml/bind/v2/model/core/Adapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/sun/xml/bind/v2/model/core/Ref"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"com/sun/xml/bind/v2/model/core/Ref", "com/sun/xml/bind/v2/model/annotation/AnnotationReader", "com/sun/xml/bind/v2/model/nav/Navigator", "java/lang/Object", "javax/xml/bind/annotation/adapters/XmlJavaTypeAdapter", "javax/xml/bind/annotation/XmlList", "com/sun/xml/bind/v2/model/core/Adapter"}, 2, new Object[] {"com/sun/xml/bind/v2/model/core/Ref", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/core/Ref", "valueList", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
