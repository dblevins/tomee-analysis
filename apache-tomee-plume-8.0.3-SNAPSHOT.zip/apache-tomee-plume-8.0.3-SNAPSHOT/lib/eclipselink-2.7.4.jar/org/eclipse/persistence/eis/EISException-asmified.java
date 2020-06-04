package asm.org.eclipse.persistence.eis;
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
public class EISExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/eis/EISException", null, "org/eclipse/persistence/exceptions/DatabaseException", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCORRECT_LOGIN_INSTANCE_PROVIDED", "I", null, new Integer(17002));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROP_NOT_SET", "I", null, new Integer(17007));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_PROP", "I", null, new Integer(17008));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROPS_NOT_SET", "I", null, new Integer(17009));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUTPUT_UNSUPPORTED_MSG_TYPE", "I", null, new Integer(17010));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_CONN_FACTORY", "I", null, new Integer(17011));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_INTERACTION_SPEC_TYPE", "I", null, new Integer(17012));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_RECORD_TYPE", "I", null, new Integer(17013));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNKNOWN_INTERACTION_SPEC_TYPE", "I", null, new Integer(17014));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_INPUT", "I", null, new Integer(17015));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMEOUT", "I", null, new Integer(17016));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_UNSUPPORTED_MSG_TYPE", "I", null, new Integer(17017));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_METHOD_INVOCATION", "I", null, new Integer(17018));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TX_SESSION_TEST_ERROR", "I", null, new Integer(17019));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_AQ_INTERACTION_SPEC_TYPE", "I", null, new Integer(17020));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_AQ_RECORD_TYPE", "I", null, new Integer(17021));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_AQ_INPUT", "I", null, new Integer(17022));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_FACTORY_ATTRIBUTES", "I", null, new Integer(17023));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COULD_NOT_DELETE_FILE", "I", null, new Integer(17024));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GROUPING_ELEMENT_REQUIRED", "I", null, new Integer(17025));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EIS_EXCEPTION", "I", null, new Integer(91000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_EXCEPTION", "I", null, new Integer(90000));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Exception;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DatabaseException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "resourceException", "(Ljava/lang/Exception;Lorg/eclipse/persistence/eis/EISAccessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/eis/EISException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(new Integer(90000));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setAccessor", "(Lorg/eclipse/persistence/internal/databaseaccess/Accessor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setSession", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "resourceException", "(Ljavax/resource/ResourceException;Lorg/eclipse/persistence/eis/EISAccessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "resourceException", "(Ljava/lang/Exception;Lorg/eclipse/persistence/eis/EISAccessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "resourceException", "(Ljavax/resource/ResourceException;Lorg/eclipse/persistence/queries/Call;Lorg/eclipse/persistence/eis/EISAccessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "resourceException", "(Ljavax/resource/ResourceException;Lorg/eclipse/persistence/eis/EISAccessor;Lorg/eclipse/persistence/internal/sessions/AbstractSession;)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setCall", "(Lorg/eclipse/persistence/queries/Call;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createResourceException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/eis/EISException;"));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/resource/ResourceException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/eis/EISException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(new Integer(90000));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/eis/EISException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(new Integer(91000));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/eis/EISException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/eis/EISException;"));
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "propertyNotSet", "(Ljava/lang/String;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIntInsn(SIPUSH, 17007);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "propertiesNotSet", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIntInsn(SIPUSH, 17009);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidProperty", "(Ljava/lang/String;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIntInsn(SIPUSH, 17008);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unsupportedMessageInOutputRecord", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17010);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unsupportedMessageInInputRecord", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17017);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noConnectionFactorySpecified", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17011);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidInteractionSpecType", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17012);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidAQInteractionSpecType", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17020);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createResourceException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidRecordType", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17013);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidAQRecordType", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17021);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createResourceException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unknownInteractionSpecType", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17014);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidConnectionFactoryAttributes", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17023);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createResourceException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidInput", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17015);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidAQInput", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17022);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createResourceException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "timeoutOccurred", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17016);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidMethodInvocation", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17018);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transactedSessionTestError", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17019);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupingElementRequired", "()Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitIntInsn(SIPUSH, 17025);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "couldNotDeleteFile", "([Ljava/lang/Object;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 17024);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/eis/EISException", "createResourceException", "([Ljava/lang/Object;I)Lorg/eclipse/persistence/eis/EISException;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "incorrectLoginInstanceProvided", "(Ljava/lang/Class;)Lorg/eclipse/persistence/eis/EISException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/eis/EISException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/eis/EISException;"));
methodVisitor.visitIntInsn(SIPUSH, 17002);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/eis/EISException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 17002);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/EISException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
