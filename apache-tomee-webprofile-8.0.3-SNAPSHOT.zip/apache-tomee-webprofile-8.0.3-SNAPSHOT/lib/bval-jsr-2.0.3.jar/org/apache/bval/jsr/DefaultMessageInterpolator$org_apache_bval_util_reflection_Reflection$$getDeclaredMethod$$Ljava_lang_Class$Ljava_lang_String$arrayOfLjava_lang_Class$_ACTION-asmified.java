package asm.org.apache.bval.jsr;
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
public class DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTIONDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER | ACC_SYNTHETIC, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "Ljava/security/PrivilegedAction<Ljava/lang/reflect/Method;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f1", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f2", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f3", "[Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "f1", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "f2", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "f3", "[Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "f1", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "f2", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/DefaultMessageInterpolator$org_apache_bval_util_reflection_Reflection$$getDeclaredMethod$$Ljava_lang_Class$Ljava_lang_String$arrayOfLjava_lang_Class$_ACTION", "f3", "[Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/DefaultMessageInterpolator", "__privileged_access$1", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
