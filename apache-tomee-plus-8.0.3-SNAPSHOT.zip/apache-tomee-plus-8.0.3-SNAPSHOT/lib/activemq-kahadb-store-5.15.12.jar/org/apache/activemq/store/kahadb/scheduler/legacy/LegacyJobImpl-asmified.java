package asm.org.apache.activemq.store.kahadb.scheduler.legacy;
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
public class LegacyJobImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "payload", "Lorg/apache/activemq/protobuf/Buffer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;Lorg/apache/activemq/util/ByteSequence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/Buffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/ByteSequence", "data", "[B");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/ByteSequence", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/util/ByteSequence", "length", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/Buffer", "<init>", "([BII)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "payload", "Lorg/apache/activemq/protobuf/Buffer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getJobId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPayload", "()Lorg/apache/activemq/protobuf/Buffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "payload", "Lorg/apache/activemq/protobuf/Buffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPeriod", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getPeriod", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRepeat", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getRepeat", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelay", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getDelay", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCronEntry", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getCronEntry", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextExecutionTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getNextTime", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStartTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "getStartTime", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobImpl", "jobLocation", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobLocation", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
