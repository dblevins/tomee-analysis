package asm.org.apache.activemq.store.kahadb.data;
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
public class KahaDestination$DestinationTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "Ljava/lang/Enum<Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "org/apache/activemq/store/kahadb/data/KahaDestination", "DestinationType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEMP_QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEMP_TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "$VALUES", "[Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "(Ljava/lang/String;I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "value", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getNumber", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "value", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(I)Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTableSwitchInsn(0, 3, label4, new Label[] { label0, label1, label2, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUEUE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("QUEUE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOPIC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("TOPIC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEMP_QUEUE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("TEMP_QUEUE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEMP_TOPIC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("TEMP_TOPIC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_QUEUE", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "TEMP_TOPIC", "Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/data/KahaDestination$DestinationType", "$VALUES", "[Lorg/apache/activemq/store/kahadb/data/KahaDestination$DestinationType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
