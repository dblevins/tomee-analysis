package asm.org.apache.catalina.filters;
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
public class RestCsrfPreventionFilter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_SYNTHETIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/catalina/filters/RestCsrfPreventionFilter", null, null);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/catalina/filters/RestCsrfPreventionFilter$MethodType", "org/apache/catalina/filters/RestCsrfPreventionFilter", "MethodType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$apache$catalina$filters$RestCsrfPreventionFilter$MethodType", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$MethodType", "values", "()[Lorg/apache/catalina/filters/RestCsrfPreventionFilter$MethodType;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$1", "$SwitchMap$org$apache$catalina$filters$RestCsrfPreventionFilter$MethodType", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$1", "$SwitchMap$org$apache$catalina$filters$RestCsrfPreventionFilter$MethodType", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/RestCsrfPreventionFilter$MethodType", "NON_MODIFYING_METHOD", "Lorg/apache/catalina/filters/RestCsrfPreventionFilter$MethodType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/RestCsrfPreventionFilter$MethodType", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}