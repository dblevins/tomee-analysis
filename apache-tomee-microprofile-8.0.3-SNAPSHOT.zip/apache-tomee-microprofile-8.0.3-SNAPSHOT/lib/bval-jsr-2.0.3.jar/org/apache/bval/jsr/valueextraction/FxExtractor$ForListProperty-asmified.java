package asm.org.apache.bval.jsr.valueextraction;
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
public class FxExtractor$ForListPropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/valueextraction/FxExtractor$ForListProperty", "Ljava/lang/Object;Ljakarta/validation/valueextraction/ValueExtractor<Ljavafx/beans/property/ReadOnlyListProperty<*>;>;", "java/lang/Object", new String[] { "jakarta/validation/valueextraction/ValueExtractor" });

{
annotationVisitor0 = classWriter.visitTypeAnnotation(268435456, TypePath.fromString("0;0;"), "Ljakarta/validation/valueextraction/ExtractedValue;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/bval/jsr/valueextraction/FxExtractor$ForListProperty", "org/apache/bval/jsr/valueextraction/FxExtractor", "ForListProperty", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/validation/valueextraction/ValueExtractor$ValueReceiver", "jakarta/validation/valueextraction/ValueExtractor", "ValueReceiver", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "extractValues", "(Ljavafx/beans/property/ReadOnlyListProperty;Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;)V", "(Ljavafx/beans/property/ReadOnlyListProperty<*>;Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javafx/beans/property/ReadOnlyListProperty", "getValue", "()Ljavafx/collections/ObservableList;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "ofNullable", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/valueextraction/FxExtractor$ForListProperty", "lambda$extractValues$0", "(Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;Ljavafx/collections/ObservableList;)V", false), Type.getType("(Ljavafx/collections/ObservableList;)V")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "ifPresent", "(Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "extractValues", "(Ljava/lang/Object;Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javafx/beans/property/ReadOnlyListProperty");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/valueextraction/FxExtractor$ForListProperty", "extractValues", "(Ljavafx/beans/property/ReadOnlyListProperty;Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$extractValues$0", "(Ljakarta/validation/valueextraction/ValueExtractor$ValueReceiver;Ljavafx/collections/ObservableList;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javafx/collections/ObservableList", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("<list element>");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javafx/collections/ObservableList", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/valueextraction/ValueExtractor$ValueReceiver", "indexedValue", "(Ljava/lang/String;ILjava/lang/Object;)V", true);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
