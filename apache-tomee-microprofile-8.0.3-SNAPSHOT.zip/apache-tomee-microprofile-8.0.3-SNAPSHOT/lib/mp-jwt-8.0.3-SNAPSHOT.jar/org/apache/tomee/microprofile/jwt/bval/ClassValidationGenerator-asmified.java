package asm.org.apache.tomee.microprofile.jwt.bval;
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
public class ClassValidationGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/Class<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/ClassValidationData", "getJwtConstraints", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/bval/JwtValidationGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/ClassValidationData", "getClazz", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/ClassValidationData", "getJwtConstraints", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/bval/JwtValidationGenerator", "<init>", "(Ljava/lang/Class;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/JwtValidationGenerator", "generateAndLoad", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/microprofile/jwt/bval/ReturnValidationGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/ClassValidationData", "getClazz", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/jwt/bval/ClassValidationGenerator", "validationData", "Lorg/apache/tomee/microprofile/jwt/bval/ClassValidationData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/ClassValidationData", "getReturnConstraints", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/jwt/bval/ReturnValidationGenerator", "<init>", "(Ljava/lang/Class;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/microprofile/jwt/bval/ReturnValidationGenerator", "generateAndLoad", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
