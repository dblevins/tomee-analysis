package asm.org.apache.bval.jsr.util;
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
public class Methods$org_apache_bval_util_reflection_Reflection$$hierarchy$$Ljava_lang_Class$Lorg_apache_bval_util_reflection_Reflection$Interfaces$_ACTIONDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER | ACC_SYNTHETIC, "org/apache/bval/jsr/util/Methods$org_apache_bval_util_reflection_Reflection$$hierarchy$$Ljava_lang_Class$Lorg_apache_bval_util_reflection_Reflection$Interfaces$_ACTION", "Ljava/security/PrivilegedAction<Ljava/lang/Iterable;>;", "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f1", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "f2", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Class;Lorg/apache/bval/util/reflection/Reflection$Interfaces;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/Methods$org_apache_bval_util_reflection_Reflection$$hierarchy$$Ljava_lang_Class$Lorg_apache_bval_util_reflection_Reflection$Interfaces$_ACTION", "f1", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/Methods$org_apache_bval_util_reflection_Reflection$$hierarchy$$Ljava_lang_Class$Lorg_apache_bval_util_reflection_Reflection$Interfaces$_ACTION", "f2", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/Methods$org_apache_bval_util_reflection_Reflection$$hierarchy$$Ljava_lang_Class$Lorg_apache_bval_util_reflection_Reflection$Interfaces$_ACTION", "f1", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/Methods$org_apache_bval_util_reflection_Reflection$$hierarchy$$Ljava_lang_Class$Lorg_apache_bval_util_reflection_Reflection$Interfaces$_ACTION", "f2", "Lorg/apache/bval/util/reflection/Reflection$Interfaces;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/Methods", "__privileged_access$0", "(Ljava/lang/Class;Lorg/apache/bval/util/reflection/Reflection$Interfaces;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
