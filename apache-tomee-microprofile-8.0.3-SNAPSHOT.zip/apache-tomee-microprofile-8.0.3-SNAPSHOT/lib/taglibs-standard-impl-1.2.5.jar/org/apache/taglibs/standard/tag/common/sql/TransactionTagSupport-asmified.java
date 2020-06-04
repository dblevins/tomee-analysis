package asm.org.apache.taglibs.standard.tag.common.sql;
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
public class TransactionTagSupportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", null, "javax/servlet/jsp/tagext/TagSupport", new String[] { "javax/servlet/jsp/tagext/TryCatchFinally" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRANSACTION_READ_COMMITTED", "Ljava/lang/String;", null, "read_committed");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRANSACTION_READ_UNCOMMITTED", "Ljava/lang/String;", null, "read_uncommitted");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRANSACTION_REPEATABLE_READ", "Ljava/lang/String;", null, "repeatable_read");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRANSACTION_SERIALIZABLE", "Ljava/lang/String;", null, "serializable");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "rawDataSource", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dataSourceSpecified", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "conn", "Ljava/sql/Connection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isolation", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "origIsolation", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/tagext/TagSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "dataSourceSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "rawDataSource", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStartTag", "()I", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "rawDataSource", "Ljava/lang/Object;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "dataSourceSpecified", "Z");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SQL_DATASOURCE_NULL");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "rawDataSource", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "pageContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tag/common/sql/DataSourceUtil", "getDataSource", "(Ljava/lang/Object;Ljavax/servlet/jsp/PageContext;)Ljavax/sql/DataSource;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/DataSource", "getConnection", "()Ljava/sql/Connection;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "getTransactionIsolation", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "origIsolation", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "origIsolation", "I");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspTagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRANSACTION_NO_SUPPORT");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspTagException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "origIsolation", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "setTransactionIsolation", "(I)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "setAutoCommit", "(Z)V", true);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspTagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR_GET_CONNECTION");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspTagException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doEndTag", "()I", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "commit", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspTagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRANSACTION_COMMIT_ERROR");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/sql/SQLException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspTagException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doCatch", "(Ljava/lang/Throwable;)V", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "rollback", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doFinally", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/sql/SQLException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "origIsolation", "I");
methodVisitor.visitJumpInsn(IF_ICMPEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "origIsolation", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "setTransactionIsolation", "(I)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "setAutoCommit", "(Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/Connection", "close", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "dataSourceSpecified", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "rawDataSource", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIsolation", "(Ljava/lang/String;)V", null, new String[] { "javax/servlet/jsp/JspTagException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("read_committed");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("read_uncommitted");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitLdcInsn("repeatable_read");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitLdcInsn("serializable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "isolation", "I");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspTagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRANSACTION_INVALID_ISOLATION");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspTagException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSharedConnection", "()Ljava/sql/Connection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/sql/TransactionTagSupport", "conn", "Ljava/sql/Connection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
