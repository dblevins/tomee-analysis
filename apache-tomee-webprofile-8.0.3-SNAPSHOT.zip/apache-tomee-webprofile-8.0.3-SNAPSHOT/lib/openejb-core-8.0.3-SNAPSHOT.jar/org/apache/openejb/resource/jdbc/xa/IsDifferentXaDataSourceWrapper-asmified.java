package asm.org.apache.openejb.resource.jdbc.xa;
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
public class IsDifferentXaDataSourceWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", null, "java/lang/Object", new String[] { "javax/sql/XADataSource" });

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "API_CONNECTION", "[Ljava/lang/Class;", "[Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "API_RESOURCE", "[Ljava/lang/Class;", "[Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljavax/sql/XADataSource;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/sql/XADataSource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXAConnection", "()Ljavax/sql/XAConnection;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "getXAConnection", "()Ljavax/sql/XAConnection;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "wrap", "(Ljavax/sql/XAConnection;)Ljavax/sql/XAConnection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXAConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/sql/XAConnection;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "getXAConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/sql/XAConnection;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "wrap", "(Ljavax/sql/XAConnection;)Ljavax/sql/XAConnection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "wrap", "(Ljavax/sql/XAConnection;)Ljavax/sql/XAConnection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/sql/XAConnection;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "API_CONNECTION", "[Ljava/lang/Class;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper$1", "<init>", "(Lorg/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper;Ljavax/sql/XAConnection;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Proxy", "newProxyInstance", "(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/sql/XAConnection");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogWriter", "()Ljava/io/PrintWriter;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "getLogWriter", "()Ljava/io/PrintWriter;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLogWriter", "(Ljava/io/PrintWriter;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "setLogWriter", "(Ljava/io/PrintWriter;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLoginTimeout", "(I)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "setLoginTimeout", "(I)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoginTimeout", "()I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "getLoginTimeout", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParentLogger", "()Ljava/util/logging/Logger;", null, new String[] { "java/sql/SQLFeatureNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "delegate", "Ljavax/sql/XADataSource;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/sql/XADataSource", "getParentLogger", "()Ljava/util/logging/Logger;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()[Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "API_RESOURCE", "[Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/sql/XAConnection;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "API_CONNECTION", "[Ljava/lang/Class;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/transaction/xa/XAResource;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/resource/jdbc/xa/IsDifferentXaDataSourceWrapper", "API_RESOURCE", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
