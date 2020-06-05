package asm.org.apache.johnzon.core;
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
public class JohnzonJsonParserImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_SYNTHETIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/johnzon/core/JohnzonJsonParserImpl", null, null);

classWriter.visitInnerClass("org/apache/johnzon/core/JohnzonJsonParserImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/json/stream/JsonParser$Event", "jakarta/json/stream/JsonParser", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$javax$json$stream$JsonParser$Event", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchFieldError");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchFieldError");
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label12, label13, label14, "java/lang/NoSuchFieldError");
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
methodVisitor.visitTryCatchBlock(label15, label16, label17, "java/lang/NoSuchFieldError");
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
methodVisitor.visitTryCatchBlock(label18, label19, label20, "java/lang/NoSuchFieldError");
Label label21 = new Label();
Label label22 = new Label();
Label label23 = new Label();
methodVisitor.visitTryCatchBlock(label21, label22, label23, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/json/stream/JsonParser$Event", "values", "()[Ljakarta/json/stream/JsonParser$Event;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "START_ARRAY", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "START_OBJECT", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_TRUE", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_FALSE", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_NULL", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label13);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_STRING", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label16);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "KEY_NAME", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label19);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/johnzon/core/JohnzonJsonParserImpl$1", "$SwitchMap$javax$json$stream$JsonParser$Event", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/json/stream/JsonParser$Event", "VALUE_NUMBER", "Ljakarta/json/stream/JsonParser$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/json/stream/JsonParser$Event", "ordinal", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label22);
Label label24 = new Label();
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}