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
public class FxExtractor$ForMapPropertyValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/valueextraction/FxExtractor$ForMapPropertyValue", "Ljava/lang/Object;Ljavax/validation/valueextraction/ValueExtractor<Ljavafx/beans/property/ReadOnlyMapProperty<**>;>;", "java/lang/Object", new String[] { "javax/validation/valueextraction/ValueExtractor" });

{
annotationVisitor0 = classWriter.visitTypeAnnotation(268435456, TypePath.fromString("0;1;"), "Ljavax/validation/valueextraction/ExtractedValue;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/bval/jsr/valueextraction/FxExtractor$ForMapPropertyValue", "org/apache/bval/jsr/valueextraction/FxExtractor", "ForMapPropertyValue", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/valueextraction/ValueExtractor$ValueReceiver", "javax/validation/valueextraction/ValueExtractor", "ValueReceiver", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "extractValues", "(Ljavafx/beans/property/ReadOnlyMapProperty;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", "(Ljavafx/beans/property/ReadOnlyMapProperty<**>;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javafx/beans/property/ReadOnlyMapProperty", "getValue", "()Ljavafx/collections/ObservableMap;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Optional", "ofNullable", "(Ljava/lang/Object;)Ljava/util/Optional;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/valueextraction/FxExtractor$ForMapPropertyValue", "lambda$extractValues$1", "(Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;Ljavafx/collections/ObservableMap;)V", false), Type.getType("(Ljavafx/collections/ObservableMap;)V")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Optional", "ifPresent", "(Ljava/util/function/Consumer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "extractValues", "(Ljava/lang/Object;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javafx/beans/property/ReadOnlyMapProperty");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/valueextraction/FxExtractor$ForMapPropertyValue", "extractValues", "(Ljavafx/beans/property/ReadOnlyMapProperty;Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$extractValues$1", "(Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;Ljavafx/collections/ObservableMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javafx/collections/ObservableMap", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/valueextraction/FxExtractor$ForMapPropertyValue", "lambda$null$0", "(Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;Ljava/util/Map$Entry;)V", false), Type.getType("(Ljava/util/Map$Entry;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$null$0", "(Ljavax/validation/valueextraction/ValueExtractor$ValueReceiver;Ljava/util/Map$Entry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("<map value>");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/valueextraction/ValueExtractor$ValueReceiver", "keyedValue", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
