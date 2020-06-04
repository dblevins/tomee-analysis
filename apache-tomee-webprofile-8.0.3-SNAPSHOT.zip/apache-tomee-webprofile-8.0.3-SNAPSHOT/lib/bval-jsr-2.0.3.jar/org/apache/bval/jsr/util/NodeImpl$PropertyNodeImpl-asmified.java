package asm.org.apache.bval.jsr.util;
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
public class NodeImpl$PropertyNodeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/util/NodeImpl$PropertyNodeImpl", null, "org/apache/bval/jsr/util/NodeImpl", new String[] { "javax/validation/Path$PropertyNode" });

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$PropertyNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "PropertyNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/Path$Node", "javax/validation/Path", "Node", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/Path$PropertyNode", "javax/validation/Path", "PropertyNode", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl", "<init>", "(Ljava/lang/String;Lorg/apache/bval/jsr/util/NodeImpl$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/validation/Path$Node;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl", "<init>", "(Ljavax/validation/Path$Node;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/validation/Path$PropertyNode;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/NodeImpl", "access$000", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Lorg/apache/bval/jsr/util/NodeImpl$PropertyNodeImpl;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$PropertyNodeImpl", "lambda$new$0", "(Ljavax/validation/Path$PropertyNode;)V", false), Type.getType("(Ljavax/validation/Path$PropertyNode;)V")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "ifPresent", "(Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKind", "()Ljavax/validation/ElementKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/ElementKind", "PROPERTY", "Ljavax/validation/ElementKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$0", "(Ljavax/validation/Path$PropertyNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Path$PropertyNode", "getContainerClass", "()Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Path$PropertyNode", "getTypeArgumentIndex", "()Ljava/lang/Integer;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl$PropertyNodeImpl", "inContainer", "(Ljava/lang/Class;Ljava/lang/Integer;)Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
