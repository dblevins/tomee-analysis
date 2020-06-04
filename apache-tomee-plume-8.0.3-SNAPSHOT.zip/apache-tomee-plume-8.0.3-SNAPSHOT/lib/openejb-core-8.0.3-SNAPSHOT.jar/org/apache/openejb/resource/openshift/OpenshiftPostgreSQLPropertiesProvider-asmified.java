package asm.org.apache.openejb.resource.openshift;
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
public class OpenshiftPostgreSQLPropertiesProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/openshift/OpenshiftPostgreSQLPropertiesProvider", null, "java/lang/Object", new String[] { "org/apache/openejb/api/resource/PropertiesResourceProvider" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "provides", "()Ljava/util/Properties;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/testng/PropertiesBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/testng/PropertiesBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("JdbcDriver");
methodVisitor.visitLdcInsn("org.postgresql.Driver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testng/PropertiesBuilder", "p", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/testng/PropertiesBuilder;", false);
methodVisitor.visitLdcInsn("JdbcUrl");
methodVisitor.visitLdcInsn("jdbc:postgresql://%s:%s/%s?tcpKeepAlive=true");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("OPENSHIFT_POSTGRESQL_DB_HOST");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("OPENSHIFT_POSTGRESQL_DB_PORT");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("OPENSHIFT_APP_NAME");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testng/PropertiesBuilder", "p", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/testng/PropertiesBuilder;", false);
methodVisitor.visitLdcInsn("UserName");
methodVisitor.visitLdcInsn("OPENSHIFT_POSTGRESQL_DB_USERNAME");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testng/PropertiesBuilder", "p", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/testng/PropertiesBuilder;", false);
methodVisitor.visitLdcInsn("Password");
methodVisitor.visitLdcInsn("OPENSHIFT_POSTGRESQL_DB_PASSWORD");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getenv", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testng/PropertiesBuilder", "p", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/testng/PropertiesBuilder;", false);
methodVisitor.visitLdcInsn("ValidationQuery");
methodVisitor.visitLdcInsn("SELECT 1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testng/PropertiesBuilder", "p", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openejb/testng/PropertiesBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/testng/PropertiesBuilder", "build", "()Ljava/util/Properties;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
