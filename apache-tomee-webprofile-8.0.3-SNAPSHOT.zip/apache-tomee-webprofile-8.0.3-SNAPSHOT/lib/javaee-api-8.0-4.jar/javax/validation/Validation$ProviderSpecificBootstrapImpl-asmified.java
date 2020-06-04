package asm.javax.validation;
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
public class Validation$ProviderSpecificBootstrapImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "<T::Ljavax/validation/Configuration<TT;>;U::Ljavax/validation/spi/ValidationProvider<TT;>;>Ljava/lang/Object;Ljavax/validation/bootstrap/ProviderSpecificBootstrap<TT;>;", "java/lang/Object", new String[] { "javax/validation/bootstrap/ProviderSpecificBootstrap" });

classWriter.visitInnerClass("javax/validation/Validation$ProviderSpecificBootstrapImpl", "javax/validation/Validation", "ProviderSpecificBootstrapImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/Validation$GenericBootstrapImpl", "javax/validation/Validation", "GenericBootstrapImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/Validation$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "providerClass", "Ljava/lang/Class;", "Ljava/lang/Class<TU;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "vpResolver", "Ljavax/validation/ValidationProviderResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<TU;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "providerClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "providerResolver", "(Ljavax/validation/ValidationProviderResolver;)Ljavax/validation/bootstrap/ProviderSpecificBootstrap;", "(Ljavax/validation/ValidationProviderResolver;)Ljavax/validation/bootstrap/ProviderSpecificBootstrap<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "vpResolver", "Ljavax/validation/ValidationProviderResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "()Ljavax/validation/Configuration;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "providerClass", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/validation/ValidationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No resolver provided");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/ValidationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/validation/Validation$GenericBootstrapImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/Validation$GenericBootstrapImpl", "<init>", "(Ljavax/validation/Validation$1;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "vpResolver", "Ljavax/validation/ValidationProviderResolver;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/validation/Validation$GenericBootstrapImpl", "getDefaultValidationProviderResolver", "()Ljavax/validation/ValidationProviderResolver;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "vpResolver", "Ljavax/validation/ValidationProviderResolver;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/validation/Validation$GenericBootstrapImpl"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "vpResolver", "Ljavax/validation/ValidationProviderResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/validation/Validation$GenericBootstrapImpl", "providerResolver", "(Ljavax/validation/ValidationProviderResolver;)Ljavax/validation/bootstrap/GenericBootstrap;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "vpResolver", "Ljavax/validation/ValidationProviderResolver;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidationProviderResolver", "getValidationProviders", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/spi/ValidationProvider");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "providerClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "providerClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/validation/spi/ValidationProvider");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/spi/ValidationProvider", "createSpecializedConfiguration", "(Ljavax/validation/spi/BootstrapState;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/validation/ValidationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("No provider found for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "providerClass", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/ValidationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
