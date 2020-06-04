package asm.org.apache.openjpa.lib.jdbc;
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
public class LoggingConnectionDecoratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", null, "java/lang/Object", new String[] { "org/apache/openjpa/lib/jdbc/ConnectionDecorator" });

classWriter.visitInnerClass("org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$LoggingConnection", "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "LoggingConnection", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler", "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "SQLWarningHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SEP", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_IGNORE", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_LOG_TRACE", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_LOG_INFO", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_LOG_WARN", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_LOG_ERROR", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_THROW", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARN_HANDLE", "I", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WARNING_ACTIONS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_logs", "Lorg/apache/openjpa/lib/jdbc/DataSourceLogs;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_prettyPrint", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_prettyPrintLineLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_warningAction", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_warningHandler", "Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_printParameters", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/jdbc/DataSourceLogs");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/DataSourceLogs", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_logs", "Lorg/apache/openjpa/lib/jdbc/DataSourceLogs;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrintLineLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningAction", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_printParameters", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrettyPrint", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrint", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrint", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/jdbc/SQLFormatter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/SQLFormatter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrintLineLength", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/SQLFormatter", "setLineLength", "(I)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrint", "Z");
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrettyPrint", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrint", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrettyPrintLineLength", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrintLineLength", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/SQLFormatter", "setLineLength", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrettyPrintLineLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrintLineLength", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrintParameters", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_printParameters", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrintParameters", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_printParameters", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWarningAction", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "indexOf", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningAction", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWarningAction", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningAction", "I");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWarningHandler", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningHandler", "Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWarningHandler", "()Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningHandler", "Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogs", "()Lorg/apache/openjpa/lib/jdbc/DataSourceLogs;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_logs", "Lorg/apache/openjpa/lib/jdbc/DataSourceLogs;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decorate", "(Ljava/sql/Connection;)Ljava/sql/Connection;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "newLoggingConnection", "(Ljava/sql/Connection;)Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$LoggingConnection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "newLoggingConnection", "(Ljava/sql/Connection;)Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$LoggingConnection;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$LoggingConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$LoggingConnection", "<init>", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;Ljava/sql/Connection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrap", "(Ljava/sql/SQLException;Ljava/lang/String;)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;I)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;I)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/lib/jdbc/ReportingSQLException");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/jdbc/ReportingSQLException");
methodVisitor.visitVarInsn(ASTORE, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/lib/jdbc/ReportingSQLException"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/jdbc/ReportingSQLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/ReportingSQLException", "<init>", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/ReportingSQLException", "setIndexOfFirstFailedObject", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;Ljava/sql/SQLException;Ljava/lang/String;)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/lang/String;)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;)Lorg/apache/openjpa/lib/jdbc/DataSourceLogs;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_logs", "Lorg/apache/openjpa/lib/jdbc/DataSourceLogs;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningAction", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;)Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_warningHandler", "Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator$SQLWarningHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;)Lorg/apache/openjpa/lib/jdbc/SQLFormatter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_formatter", "Lorg/apache/openjpa/lib/jdbc/SQLFormatter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "SEP", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;Ljava/lang/String;)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;Ljava/sql/SQLException;Ljava/sql/Statement;)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;Ljava/sql/SQLException;Ljava/sql/Statement;I)Ljava/sql/SQLException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "wrap", "(Ljava/sql/SQLException;Ljava/sql/Statement;I)Ljava/sql/SQLException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1300", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_printParameters", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1400", "(Lorg/apache/openjpa/lib/jdbc/LoggingConnectionDecorator;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "_prettyPrint", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/J2DoPrivHelper", "getLineSeparator", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "SEP", "Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("ignore");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("trace");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("info");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("warn");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("error");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("throw");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/jdbc/LoggingConnectionDecorator", "WARNING_ACTIONS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("handle");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
