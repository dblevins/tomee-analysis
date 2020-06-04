package asm.org.apache.openejb.monitoring;
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
public class ConnectionFactoryMonitor$PartitionStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "Ljava/lang/Enum<Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "org/apache/openejb/monitoring/ConnectionFactoryMonitor", "PartitionStrategy", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BY_SUBJECT", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BY_CONNECTOR_PROPERTIES", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOWN", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "$VALUES", "[Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "NONE", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BY_SUBJECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("by-subject");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "BY_SUBJECT", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BY_CONNECTOR_PROPERTIES");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("by-connector-properties");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "BY_CONNECTOR_PROPERTIES", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOWN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("unknown");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "UNKNOWN", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "NONE", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "BY_SUBJECT", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "BY_CONNECTOR_PROPERTIES", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "UNKNOWN", "Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy", "$VALUES", "[Lorg/apache/openejb/monitoring/ConnectionFactoryMonitor$PartitionStrategy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
