package asm.org.apache.openejb.client;
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
public class RequestMethodCodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/client/RequestMethodCode", "Ljava/lang/Enum<Lorg/apache/openejb/client/RequestMethodCode;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_GET_EJB_META_DATA", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_GET_HOME_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_REMOVE_BY_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_REMOVE_BY_PKEY", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_FIND", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_CREATE", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT_GET_EJB_HOME", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT_GET_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT_GET_PRIMARY_KEY", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT_IS_IDENTICAL", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT_REMOVE", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_OBJECT_BUSINESS_METHOD", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_HOME_METHOD", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JNDI_LOOKUP", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JNDI_LIST", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JNDI_LIST_BINDINGS", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FUTURE_CANCEL", "Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "code", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ENUM_MAP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Integer;Lorg/apache/openejb/client/RequestMethodCode;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/client/RequestMethodCode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/client/RequestMethodCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "$VALUES", "[Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/client/RequestMethodCode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/client/RequestMethodCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/client/RequestMethodCode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/RequestMethodCode", "code", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RequestMethodCode", "code", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(I)Lorg/apache/openejb/client/RequestMethodCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "ENUM_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/client/RequestMethodCode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_GET_EJB_META_DATA");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_GET_EJB_META_DATA", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_GET_HOME_HANDLE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_GET_HOME_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_REMOVE_BY_HANDLE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_REMOVE_BY_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_REMOVE_BY_PKEY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_REMOVE_BY_PKEY", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_FIND");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_FIND", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_CREATE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_CREATE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT_GET_EJB_HOME");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_GET_EJB_HOME", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT_GET_HANDLE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_GET_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT_GET_PRIMARY_KEY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_GET_PRIMARY_KEY", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT_IS_IDENTICAL");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_IS_IDENTICAL", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT_REMOVE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_REMOVE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_OBJECT_BUSINESS_METHOD");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_BUSINESS_METHOD", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_HOME_METHOD");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_METHOD", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JNDI_LOOKUP");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "JNDI_LOOKUP", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JNDI_LIST");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "JNDI_LIST", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JNDI_LIST_BINDINGS");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "JNDI_LIST_BINDINGS", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FUTURE_CANCEL");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestMethodCode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "FUTURE_CANCEL", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/client/RequestMethodCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_GET_EJB_META_DATA", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_GET_HOME_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_REMOVE_BY_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_REMOVE_BY_PKEY", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_FIND", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_CREATE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_GET_EJB_HOME", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_GET_HANDLE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_GET_PRIMARY_KEY", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_IS_IDENTICAL", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_REMOVE", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_OBJECT_BUSINESS_METHOD", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "EJB_HOME_METHOD", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "JNDI_LOOKUP", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "JNDI_LIST", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "JNDI_LIST_BINDINGS", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "FUTURE_CANCEL", "Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "$VALUES", "[Lorg/apache/openejb/client/RequestMethodCode;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestMethodCode", "ENUM_MAP", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/RequestMethodCode", "values", "()[Lorg/apache/openejb/client/RequestMethodCode;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/openejb/client/RequestMethodCode;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestMethodCode", "ENUM_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RequestMethodCode", "code", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
