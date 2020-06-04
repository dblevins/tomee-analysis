package asm.org.apache.openejb.util;
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
public class LogCategoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/LogCategory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_ADMIN", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_STARTUP", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_STARTUP_CONFIG", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_STARTUP_VALIDATION", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_SERVER", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_SERVER_REMOTE", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_SECURITY", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_RESOURCE_JDBC", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_CONNECTOR", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_DEPLOY", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_HSQL", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_WS", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_RS", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_JPA", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_CDI", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSACTION", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTIVEMQ", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GERONIMO", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENJPA", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CORBA_ADAPTER", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AXIS", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AXIS2", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CXF", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMER", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTPSERVER", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVICEPOOL", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPENEJB_SQL", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MONITORING", "Lorg/apache/openejb/util/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/util/LogCategory", "java/lang/String"}, 1, new Object[] {"org/apache/openejb/util/LogCategory"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/util/LogCategory", "java/lang/String"}, 2, new Object[] {"org/apache/openejb/util/LogCategory", "java/lang/String"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/util/LogCategory;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/util/LogCategory");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OpenEJB");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("admin");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_ADMIN", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("startup");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_STARTUP", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_STARTUP", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("config");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_STARTUP_CONFIG", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_STARTUP", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("validation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_STARTUP_VALIDATION", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("server");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SERVER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SERVER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("remote");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SERVER_REMOTE", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("security");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SECURITY", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("resource.jdbc");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_RESOURCE_JDBC", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("connector");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_CONNECTOR", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("deploy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_DEPLOY", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("hsql");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_HSQL", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("ws");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_WS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("rs");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_RS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("jpa");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_JPA", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("cdi");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_CDI", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transaction");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "TRANSACTION", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.apache.activemq");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "ACTIVEMQ", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("org.apache.geronimo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "GERONIMO", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("openjpa");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENJPA", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CORBA-Adapter");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "CORBA_ADAPTER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("axis");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "AXIS", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("axis");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "AXIS2", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "CXF", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/util/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Timer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogCategory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "TIMER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SERVER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("http");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "HTTPSERVER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SERVER", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("pool");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "SERVICEPOOL", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("sql");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB_SQL", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("monitoring");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogCategory", "createChild", "(Ljava/lang/String;)Lorg/apache/openejb/util/LogCategory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/util/LogCategory", "MONITORING", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
