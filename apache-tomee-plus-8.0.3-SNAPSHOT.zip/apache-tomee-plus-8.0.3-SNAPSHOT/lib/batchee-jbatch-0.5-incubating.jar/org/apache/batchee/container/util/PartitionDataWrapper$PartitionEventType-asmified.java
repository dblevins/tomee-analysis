package asm.org.apache.batchee.container.util;
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
public class PartitionDataWrapper$PartitionEventTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "Ljava/lang/Enum<Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "org/apache/batchee/container/util/PartitionDataWrapper", "PartitionEventType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANALYZE_COLLECTOR_DATA", "Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANALYZE_STATUS", "Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "$VALUES", "[Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANALYZE_COLLECTOR_DATA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "ANALYZE_COLLECTOR_DATA", "Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANALYZE_STATUS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "ANALYZE_STATUS", "Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "ANALYZE_COLLECTOR_DATA", "Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "ANALYZE_STATUS", "Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType", "$VALUES", "[Lorg/apache/batchee/container/util/PartitionDataWrapper$PartitionEventType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
