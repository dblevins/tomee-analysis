package asm.org.apache.openjpa.persistence.validation;
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
public class ValidationUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/validation/ValidationUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setupValidation", "(Lorg/apache/openjpa/conf/OpenJPAConfiguration;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/RuntimeException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getConfigurationLog", "()Lorg/apache/openjpa/lib/log/Log;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getSpecificationInstance", "()Lorg/apache/openjpa/conf/Specification;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/Specification", "getVersion", "()I", false);
methodVisitor.visitInsn(ICONST_2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Not creating a ValidatorImpl because this app is using the JPA 1.0 Spec");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openjpa/lib/log/Log", Opcodes.INTEGER}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/ValidationMode", "NONE", "Ljakarta/persistence/ValidationMode;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getValidationMode", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/ValidationMode", "CALLBACK", "Ljakarta/persistence/ValidationMode;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getValidationMode", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Trying to load jakarta.validation APIs based on the ValidationMode=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getValidationMode", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitLdcInsn("jakarta.validation.ValidationException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/validation/ValidationUtils", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("vlem-creation-error");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/validation/ValidationUnavailableException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer$Message", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/validation/ValidationUnavailableException", "<init>", "(Ljava/lang/String;Ljava/lang/RuntimeException;Z)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/ClassNotFoundException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/validation/ValidationUtils", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("vlem-creation-warn");
methodVisitor.visitLdcInsn("No available jakarta.validation APIs");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/validation/ValidatorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/validation/ValidatorImpl", "<init>", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "setValidatorInstance", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("validating");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "setLifecycleEventManager", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label4);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/validation/ValidationUtils", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("vlem-creation-error");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/validation/ValidationUnavailableException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer$Message", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/validation/ValidationUnavailableException", "<init>", "(Ljava/lang/String;Ljava/lang/RuntimeException;Z)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/RuntimeException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/RuntimeException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/validation/ValidationUtils", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("vlem-creation-warn");
methodVisitor.visitVarInsn(ALOAD, 5);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/conf/OpenJPAConfiguration", "org/apache/openjpa/lib/log/Log", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/RuntimeException", "java/lang/String"}, 3, new Object[] {"org/apache/openjpa/lib/log/Log", "org/apache/openjpa/lib/util/Localizer", "java/lang/String"});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/conf/OpenJPAConfiguration", "org/apache/openjpa/lib/log/Log", Opcodes.INTEGER, Opcodes.INTEGER, "java/lang/RuntimeException", "java/lang/String"}, 4, new Object[] {"org/apache/openjpa/lib/log/Log", "org/apache/openjpa/lib/util/Localizer", "java/lang/String", "java/lang/Object"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "warn", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "isTraceEnabled", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Not creating a ValidatorImpl because ValidationMode=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getValidationMode", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/log/Log", "trace", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isConstraintViolationException", "(Ljava/lang/Exception;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("jakarta.validation.ConstraintViolationException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/validation/ValidationUtils;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/validation/ValidationUtils", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
