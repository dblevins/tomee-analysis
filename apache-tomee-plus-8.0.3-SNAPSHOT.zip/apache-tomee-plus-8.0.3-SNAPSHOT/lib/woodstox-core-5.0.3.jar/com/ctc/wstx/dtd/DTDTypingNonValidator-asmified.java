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
public class DTDTypingNonValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/ctc/wstx/dtd/DTDTypingNonValidator", null, "com/ctc/wstx/dtd/DTDValidatorBase", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mHasAttrDefaults", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mCurrDefaultAttrs", "Ljava/util/BitSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mHasNormalizableAttrs", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mTmpDefaultAttrs", "Ljava/util/BitSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/ctc/wstx/dtd/DTDSubset;Lorg/codehaus/stax2/validation/ValidationContext;ZLjava/util/Map;Ljava/util/Map;)V", "(Lcom/ctc/wstx/dtd/DTDSubset;Lorg/codehaus/stax2/validation/ValidationContext;ZLjava/util/Map<Lcom/ctc/wstx/util/PrefixedName;Lcom/ctc/wstx/dtd/DTDElement;>;Ljava/util/Map<Ljava/lang/String;Lcom/ctc/wstx/ent/EntityDecl;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/dtd/DTDValidatorBase", "<init>", "(Lcom/ctc/wstx/dtd/DTDSubset;Lorg/codehaus/stax2/validation/ValidationContext;ZLjava/util/Map;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasNormalizableAttrs", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "reallyValidating", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAttrValueNormalization", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateElementStart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mTmpKey", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/PrefixedName", "reset", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ctc/wstx/util/PrefixedName;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElemSpecs", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mTmpKey", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/dtd/DTDElement");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElemCount", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElemCount", "I");
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "growArrayBy50Pct", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/ctc/wstx/dtd/DTDElement", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrElem", "Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mIdAttrIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/dtd/DTDTypingNonValidator", "NO_ATTRS", "Ljava/util/HashMap;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrAttrDefs", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasNormalizableAttrs", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "getAttributes", "()Ljava/util/HashMap;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrAttrDefs", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrAttrDefs", "Ljava/util/HashMap;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ctc/wstx/dtd/DTDTypingNonValidator", "NO_ATTRS", "Ljava/util/HashMap;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrAttrDefs", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasNormalizableAttrs", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mNormAttrs", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "attrsNeedValidation", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/ctc/wstx/dtd/DTDTypingNonValidator"});
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/ctc/wstx/dtd/DTDTypingNonValidator"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/ctc/wstx/dtd/DTDTypingNonValidator", "java/lang/String", "java/lang/String", "java/lang/String", "com/ctc/wstx/dtd/DTDElement", Opcodes.INTEGER}, 2, new Object[] {"com/ctc/wstx/dtd/DTDTypingNonValidator", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasNormalizableAttrs", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "hasAttrDefaultValues", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "getSpecialCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mTmpDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/BitSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/BitSet", "<init>", "(I)V", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mTmpDefaultAttrs", "Ljava/util/BitSet;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "java/util/BitSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "clear", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrAttrDefs", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mTmpKey", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/PrefixedName", "reset", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ctc/wstx/util/PrefixedName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/dtd/DTDAttribute");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrCount", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrCount", "I");
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "growArrayBy50Pct", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/ctc/wstx/dtd/DTDAttribute", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDAttribute", "getSpecialIndex", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitJumpInsn(IFLT, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "set", "(I)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasNormalizableAttrs", "Z");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[CII)Ljava/lang/String;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrAttrDefs", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mTmpKey", "Lcom/ctc/wstx/util/PrefixedName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/util/PrefixedName", "reset", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ctc/wstx/util/PrefixedName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/dtd/DTDAttribute");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrCount", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrCount", "I");
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/DataUtil", "growArrayBy50Pct", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/ctc/wstx/dtd/DTDAttribute", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mAttrSpecs", "[Lcom/ctc/wstx/dtd/DTDAttribute;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDAttribute", "getSpecialIndex", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitJumpInsn(IFLT, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "set", "(I)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasNormalizableAttrs", "Z");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDAttribute", "normalize", "(Lcom/ctc/wstx/dtd/DTDValidatorBase;[CII)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateElementAndAttributes", "()I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrElem", "Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mHasAttrDefaults", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mCurrDefaultAttrs", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "getSpecialCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "nextClearBit", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/ctc/wstx/dtd/DTDTypingNonValidator", "com/ctc/wstx/dtd/DTDElement", "java/util/BitSet", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "getSpecialAttrs", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/ctc/wstx/dtd/DTDAttribute");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDAttribute", "hasDefaultValue", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDTypingNonValidator", "doAddDefaultValue", "(Lcom/ctc/wstx/dtd/DTDAttribute;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "com/ctc/wstx/dtd/DTDAttribute"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "nextClearBit", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/ctc/wstx/dtd/DTDTypingNonValidator", "com/ctc/wstx/dtd/DTDElement"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ICONST_4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "getAllowedContentIfSpace", "()I", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateElementEnd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElemCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElemCount", "I");
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/ctc/wstx/dtd/DTDElement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/ctc/wstx/dtd/DTDTypingNonValidator", "mElems", "[Lcom/ctc/wstx/dtd/DTDElement;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/ctc/wstx/dtd/DTDElement", "getAllowedContentIfSpace", "()I", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validationCompleted", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getIdMap", "()Lcom/ctc/wstx/util/ElementIdMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ctc/wstx/util/ExceptionUtil", "throwGenericInternal", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}