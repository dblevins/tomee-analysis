package asm.com.sun.faces.facelets.tag.jsf;
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
public class ValidatorTagHandlerDelegateImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", null, "jakarta/faces/view/facelets/TagHandlerDelegate", new String[] { "jakarta/faces/view/AttachedObjectHandler" });

classWriter.visitInnerClass("com/sun/faces/component/validator/ComponentValidators$ValidatorInfo", "com/sun/faces/component/validator/ComponentValidators", "ValidatorInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "wrapping", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/faces/view/facelets/ValidatorHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/TagHandlerDelegate", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "isWrapping", "()Z", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "wrapping", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTag", "()Ljakarta/faces/view/facelets/Tag;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/jsf/ComponentSupport", "copyPassthroughAttributes", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;Ljakarta/faces/view/facelets/Tag;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "wrapping", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "applyWrapping", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "applyNested", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMetaRuleset", "(Ljava/lang/Class;)Ljakarta/faces/view/facelets/MetaRuleset;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("type");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/MetaRulesetImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTag", "()Ljakarta/faces/view/facelets/Tag;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/MetaRulesetImpl", "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("binding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/MetaRuleset", "ignore", "(Ljava/lang/String;)Ljakarta/faces/view/facelets/MetaRuleset;", false);
methodVisitor.visitLdcInsn("disabled");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/MetaRuleset", "ignore", "(Ljava/lang/String;)Ljakarta/faces/view/facelets/MetaRuleset;", false);
methodVisitor.visitLdcInsn("for");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/MetaRuleset", "ignore", "(Ljava/lang/String;)Ljakarta/faces/view/facelets/MetaRuleset;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyAttachedObject", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/view/facelets/FaceletContext", "FACELET_CONTEXT_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/view/facelets/FaceletContext");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/EditableValueHolder");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "isDisabled", "(Ljakarta/faces/view/facelets/FaceletContext;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("com.sun.faces.DISABLED_VALIDATORS");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/RequestStateManager", "get", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("com.sun.faces.DISABLED_VALIDATORS");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/RequestStateManager", "set", "(Ljakarta/faces/context/FacesContext;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"jakarta/faces/view/facelets/FaceletContext", "jakarta/faces/component/EditableValueHolder", "java/util/Set"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getValidatorId", "(Ljakarta/faces/view/facelets/FaceletContext;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getBinding", "()Ljakarta/faces/view/facelets/TagAttribute;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getBinding", "()Ljakarta/faces/view/facelets/TagAttribute;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/validator/Validator;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/TagAttribute", "getValueExpression", "(Ljakarta/faces/view/facelets/FaceletContext;Ljava/lang/Class;)Ljakarta/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "getValue", "(Ljakarta/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/validator/Validator");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"jakarta/el/ValueExpression", "jakarta/faces/validator/Validator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "createValidator", "(Ljakarta/faces/view/facelets/FaceletContext;)Ljakarta/faces/validator/Validator;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "setValue", "(Ljakarta/el/ELContext;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/view/facelets/TagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTag", "()Ljakarta/faces/view/facelets/Tag;", false);
methodVisitor.visitLdcInsn("No Validator was created");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/TagException", "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "setAttributes", "(Ljakarta/faces/view/facelets/FaceletContext;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/EditableValueHolder", "getValidators", "()[Ljakarta/faces/validator/Validator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "jakarta/faces/context/FacesContext", "jakarta/faces/component/UIComponent", "jakarta/faces/view/facelets/FaceletContext", "jakarta/faces/component/EditableValueHolder", "jakarta/el/ValueExpression", "jakarta/faces/validator/Validator", "[Ljakarta/faces/validator/Validator;", Opcodes.INTEGER, "[Ljakarta/faces/validator/Validator;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/faces/cdi/CdiValidator");
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/component/EditableValueHolder", "addValidator", "(Ljakarta/faces/validator/Validator;)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFor", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitLdcInsn("for");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTagAttribute", "(Ljava/lang/String;)Ljakarta/faces/view/facelets/TagAttribute;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/TagAttribute", "isLiteral", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/TagAttribute", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "jakarta/faces/view/facelets/TagAttribute"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/context/FacesContext", "getCurrentInstance", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/view/facelets/FaceletContext", "FACELET_CONTEXT_KEY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/view/facelets/FaceletContext");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/TagAttribute", "getValueExpression", "(Ljakarta/faces/view/facelets/FaceletContext;Ljava/lang/Class;)Ljakarta/el/ValueExpression;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/el/ValueExpression", "getValue", "(Ljakarta/el/ELContext;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createValidatorInfo", "(Ljakarta/faces/view/facelets/FaceletContext;)Lcom/sun/faces/component/validator/ComponentValidators$ValidatorInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/component/validator/ComponentValidators$ValidatorInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/component/validator/ComponentValidators$ValidatorInfo", "<init>", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/view/facelets/ValidatorHandler;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isWrapping", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getValidatorConfig", "()Ljakarta/faces/view/facelets/ValidatorConfig;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/facelets/ValidatorConfig", "getNextHandler", "()Ljakarta/faces/view/facelets/FaceletHandler;", true);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/view/facelets/TagHandler");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getValidatorConfig", "()Ljakarta/faces/view/facelets/ValidatorConfig;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/facelets/ValidatorConfig", "getNextHandler", "()Ljakarta/faces/view/facelets/FaceletHandler;", true);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/view/facelets/CompositeFaceletHandler");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "applyWrapping", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/FaceletContext", "getFacesContext", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/component/validator/ComponentValidators", "getValidators", "(Ljakarta/faces/context/FacesContext;Z)Lcom/sun/faces/component/validator/ComponentValidators;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "createValidatorInfo", "(Ljakarta/faces/view/facelets/FaceletContext;)Lcom/sun/faces/component/validator/ComponentValidators$ValidatorInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/validator/ComponentValidators", "pushValidatorInfo", "(Lcom/sun/faces/component/validator/ComponentValidators$ValidatorInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getValidatorConfig", "()Ljakarta/faces/view/facelets/ValidatorConfig;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/facelets/ValidatorConfig", "getNextHandler", "()Ljakarta/faces/view/facelets/FaceletHandler;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/faces/view/facelets/FaceletHandler", "apply", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/component/validator/ComponentValidators", "popValidatorInfo", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "applyNested", "(Ljakarta/faces/view/facelets/FaceletContext;Ljakarta/faces/component/UIComponent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/view/facelets/ComponentHandler", "isNew", "(Ljakarta/faces/component/UIComponent;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/component/EditableValueHolder");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/FaceletContext", "getFacesContext", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "applyAttachedObject", "(Ljakarta/faces/context/FacesContext;Ljakarta/faces/component/UIComponent;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/faces/component/UIComponent", "isCompositeComponent", "(Ljakarta/faces/component/UIComponent;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getFor", "()Ljava/lang/String;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/view/facelets/TagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTag", "()Ljakarta/faces/view/facelets/Tag;", false);
methodVisitor.visitLdcInsn("validator tags nested within composite components must have a non-null \"for\" attribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/TagException", "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/facelets/tag/jsf/CompositeComponentTagHandler", "getAttachedObjectHandlers", "(Ljakarta/faces/component/UIComponent;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/view/facelets/TagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTag", "()Ljakarta/faces/view/facelets/Tag;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Parent not an instance of EditableValueHolder: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/TagException", "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createValidator", "(Ljakarta/faces/view/facelets/FaceletContext;)Ljakarta/faces/validator/Validator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getValidatorId", "(Ljakarta/faces/view/facelets/FaceletContext;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/view/facelets/TagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/jsf/ValidatorTagHandlerDelegateImpl", "owner", "Ljakarta/faces/view/facelets/ValidatorHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/ValidatorHandler", "getTag", "()Ljakarta/faces/view/facelets/Tag;", false);
methodVisitor.visitLdcInsn("A validator id was not specified. Typically the validator id is set in the constructor ValidateHandler(ValidatorConfig)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/view/facelets/TagException", "<init>", "(Ljakarta/faces/view/facelets/Tag;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/view/facelets/FaceletContext", "getFacesContext", "()Ljakarta/faces/context/FacesContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getApplication", "()Ljakarta/faces/application/Application;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/application/Application", "createValidator", "(Ljava/lang/String;)Ljakarta/faces/validator/Validator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
