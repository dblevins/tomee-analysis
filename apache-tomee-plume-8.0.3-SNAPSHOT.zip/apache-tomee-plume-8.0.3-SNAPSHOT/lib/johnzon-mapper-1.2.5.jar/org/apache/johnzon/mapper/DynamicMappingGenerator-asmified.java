package asm.org.apache.johnzon.mapper;
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
public class DynamicMappingGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/mapper/DynamicMappingGenerator", null, "java/lang/Object", new String[] { "org/apache/johnzon/mapper/MappingGenerator" });

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "org/apache/johnzon/mapper/DynamicMappingGenerator", "InObjectOrPrimitiveJsonGenerator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "org/apache/johnzon/mapper/DynamicMappingGenerator", "WritingState", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/johnzon/mapper/MappingGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "writeStart", "Ljava/lang/Runnable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "writeEnd", "Ljava/lang/Runnable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/johnzon/mapper/MappingGenerator;Ljava/lang/Runnable;Ljava/lang/Runnable;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "delegate", "Lorg/apache/johnzon/mapper/MappingGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "writeStart", "Ljava/lang/Runnable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "writeEnd", "Ljava/lang/Runnable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "keyName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJsonGenerator", "()Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "delegate", "Lorg/apache/johnzon/mapper/MappingGenerator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/MappingGenerator", "getJsonGenerator", "()Ljavax/json/stream/JsonGenerator;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "writeStart", "Ljava/lang/Runnable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "keyName", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "<init>", "(Ljavax/json/stream/JsonGenerator;Ljava/lang/Runnable;Ljava/lang/String;Lorg/apache/johnzon/mapper/DynamicMappingGenerator$1;)V", false);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/json/stream/JsonGenerator"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeObject", "(Ljava/lang/String;Ljava/lang/Object;Ljavax/json/stream/JsonGenerator;)Lorg/apache/johnzon/mapper/MappingGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "delegate", "Lorg/apache/johnzon/mapper/MappingGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator", "ensureGenerator", "(Ljavax/json/stream/JsonGenerator;)Ljavax/json/stream/JsonGenerator;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/MappingGenerator", "writeObject", "(Ljava/lang/String;Ljava/lang/Object;Ljavax/json/stream/JsonGenerator;)Lorg/apache/johnzon/mapper/MappingGenerator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeObject", "(Ljava/lang/Object;Ljavax/json/stream/JsonGenerator;)Lorg/apache/johnzon/mapper/MappingGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "delegate", "Lorg/apache/johnzon/mapper/MappingGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/mapper/DynamicMappingGenerator", "ensureGenerator", "(Ljavax/json/stream/JsonGenerator;)Ljavax/json/stream/JsonGenerator;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/johnzon/mapper/MappingGenerator", "writeObject", "(Ljava/lang/Object;Ljavax/json/stream/JsonGenerator;)Lorg/apache/johnzon/mapper/MappingGenerator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "ensureGenerator", "(Ljavax/json/stream/JsonGenerator;)Ljavax/json/stream/JsonGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "access$100", "(Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;)Ljavax/json/stream/JsonGenerator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/mapper/DynamicMappingGenerator", "getJsonGenerator", "()Ljavax/json/stream/JsonGenerator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flushIfNeeded", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "access$200", "(Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;)Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "WROTE_START", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "writeEnd", "Ljava/lang/Runnable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Runnable", "run", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/mapper/DynamicMappingGenerator", "generator", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$WritingState", "NONE", "Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator", "access$202", "(Lorg/apache/johnzon/mapper/DynamicMappingGenerator$InObjectOrPrimitiveJsonGenerator;Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;)Lorg/apache/johnzon/mapper/DynamicMappingGenerator$WritingState;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
