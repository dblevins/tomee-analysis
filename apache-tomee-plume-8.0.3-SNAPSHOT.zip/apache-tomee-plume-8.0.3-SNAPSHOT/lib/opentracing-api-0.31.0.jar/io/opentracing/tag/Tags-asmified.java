package asm.io.opentracing.tag;
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
public class TagsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "io/opentracing/tag/Tags", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPAN_KIND_SERVER", "Ljava/lang/String;", null, "server");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPAN_KIND_CLIENT", "Ljava/lang/String;", null, "client");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPAN_KIND_PRODUCER", "Ljava/lang/String;", null, "producer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPAN_KIND_CONSUMER", "Ljava/lang/String;", null, "consumer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_URL", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_STATUS", "Lio/opentracing/tag/IntTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_METHOD", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PEER_HOST_IPV4", "Lio/opentracing/tag/IntOrStringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PEER_HOST_IPV6", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PEER_SERVICE", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PEER_HOSTNAME", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PEER_PORT", "Lio/opentracing/tag/IntTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAMPLING_PRIORITY", "Lio/opentracing/tag/IntTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPAN_KIND", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR", "Lio/opentracing/tag/BooleanTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DB_TYPE", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DB_INSTANCE", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DB_USER", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DB_STATEMENT", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_BUS_DESTINATION", "Lio/opentracing/tag/StringTag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http.url");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "HTTP_URL", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/IntTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http.status_code");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/IntTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "HTTP_STATUS", "Lio/opentracing/tag/IntTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http.method");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "HTTP_METHOD", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/IntOrStringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("peer.ipv4");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/IntOrStringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "PEER_HOST_IPV4", "Lio/opentracing/tag/IntOrStringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("peer.ipv6");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "PEER_HOST_IPV6", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("peer.service");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "PEER_SERVICE", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("peer.hostname");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "PEER_HOSTNAME", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/IntTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("peer.port");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/IntTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "PEER_PORT", "Lio/opentracing/tag/IntTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/IntTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("sampling.priority");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/IntTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "SAMPLING_PRIORITY", "Lio/opentracing/tag/IntTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("span.kind");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "SPAN_KIND", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("component");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "COMPONENT", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/BooleanTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("error");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/BooleanTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "ERROR", "Lio/opentracing/tag/BooleanTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("db.type");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "DB_TYPE", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("db.instance");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "DB_INSTANCE", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("db.user");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "DB_USER", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("db.statement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "DB_STATEMENT", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitTypeInsn(NEW, "io/opentracing/tag/StringTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("message_bus.destination");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "io/opentracing/tag/StringTag", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "io/opentracing/tag/Tags", "MESSAGE_BUS_DESTINATION", "Lio/opentracing/tag/StringTag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
