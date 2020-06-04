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
public class ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTIONDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER | ACC_SYNTHETIC, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "Ljava/security/PrivilegedExceptionAction<Ljava/lang/Class;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f1", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f2", "Ljava/lang/ClassLoader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "f1", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "f2", "Ljava/lang/ClassLoader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "f1", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ApacheValidatorFactory$org_apache_bval_util_reflection_Reflection$$toClass$$Ljava_lang_String$Ljava_lang_ClassLoader$_ACTION", "f2", "Ljava/lang/ClassLoader;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ApacheValidatorFactory", "__privileged_access$2", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
