package asm.org.apache.catalina.valves;
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
public class ExtendedAccessLogValve$DateElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/valves/ExtendedAccessLogValve$DateElement", null, "java/lang/Object", new String[] { "org/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement" });

classWriter.visitInnerClass("org/apache/catalina/valves/ExtendedAccessLogValve$DateElement", "org/apache/catalina/valves/ExtendedAccessLogValve", "DateElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/ExtendedAccessLogValve$DateElement$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "org/apache/catalina/valves/ExtendedAccessLogValve", "ElementTimestampStruct", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement", "org/apache/catalina/valves/AbstractAccessLogValve", "AccessLogElement", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INTERVAL", "J", null, new Long(86400000L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "currentDate", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addElement", "(Ljava/io/CharArrayWriter;Ljava/util/Date;Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$DateElement", "currentDate", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "access$000", "(Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "access$000", "(Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;)Ljava/util/Date;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "setTime", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "access$200", "(Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;)Ljava/text/SimpleDateFormat;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "access$000", "(Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;)Ljava/util/Date;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/text/SimpleDateFormat", "format", "(Ljava/util/Date;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "access$102", "(Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct", "access$100", "(Lorg/apache/catalina/valves/ExtendedAccessLogValve$ElementTimestampStruct;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/CharArrayWriter", "append", "(Ljava/lang/CharSequence;)Ljava/io/CharArrayWriter;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/ExtendedAccessLogValve$DateElement$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/ExtendedAccessLogValve$DateElement$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/ExtendedAccessLogValve$DateElement", "currentDate", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
