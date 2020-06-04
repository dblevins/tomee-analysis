package asm.com.ctc.wstx.dtd;
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
public class DefaultAttrValue$UndeclaredEntityDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "com/ctc/wstx/dtd/DefaultAttrValue", "UndeclaredEntity", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mIsPe", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mLocation", "Ljavax/xml/stream/Location;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;Ljavax/xml/stream/Location;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "mName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "mIsPe", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reportUndeclared", "(Lorg/codehaus/stax2/validation/ValidationContext;Lorg/codehaus/stax2/validation/XMLValidator;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/cfg/ErrorConsts", "ERR_DTD_UNDECLARED_ENTITY", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "mIsPe", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("parsed");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "org/codehaus/stax2/validation/ValidationContext", "org/codehaus/stax2/validation/XMLValidator"}, 4, new Object[] {"java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER});
methodVisitor.visitLdcInsn("general");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "org/codehaus/stax2/validation/ValidationContext", "org/codehaus/stax2/validation/XMLValidator"}, 5, new Object[] {"java/lang/String", "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, "java/lang/String"});
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "mName", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/validation/XMLValidationProblem");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DefaultAttrValue$UndeclaredEntity", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/validation/XMLValidationProblem", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/validation/XMLValidationProblem", "setReporter", "(Lorg/codehaus/stax2/validation/XMLValidator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/validation/ValidationContext", "reportProblem", "(Lorg/codehaus/stax2/validation/XMLValidationProblem;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
