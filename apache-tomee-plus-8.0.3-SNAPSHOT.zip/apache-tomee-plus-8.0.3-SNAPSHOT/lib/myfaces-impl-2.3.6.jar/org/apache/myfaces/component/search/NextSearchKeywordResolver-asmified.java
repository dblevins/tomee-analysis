package asm.org.apache.myfaces.component.search;
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
public class NextSearchKeywordResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/component/search/NextSearchKeywordResolver", null, "jakarta/faces/component/search/SearchKeywordResolver", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEXT_KEYWORD", "Ljava/lang/String;", null, "next");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/search/SearchKeywordResolver", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "(Ljakarta/faces/component/search/SearchKeywordContext;Ljakarta/faces/component/UIComponent;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getParent", "()Ljakarta/faces/component/UIComponent;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getChildCount", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getChildren", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "indexOf", "(Ljava/lang/Object;)I", true);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getChildCount", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/myfaces/component/search/NextSearchKeywordResolver", "jakarta/faces/component/search/SearchKeywordContext", "jakarta/faces/component/UIComponent", "java/lang/String", "jakarta/faces/component/UIComponent", "java/util/List", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/faces/component/search/UntargetableComponent");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UIComponent", "getChildCount", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/UIComponent");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/search/SearchKeywordContext", "invokeContextCallback", "(Ljakarta/faces/component/UIComponent;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/search/SearchKeywordContext", "setKeywordResolved", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isResolverForKeyword", "(Ljakarta/faces/component/search/SearchExpressionContext;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("next");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPassthrough", "(Ljakarta/faces/component/search/SearchExpressionContext;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLeaf", "(Ljakarta/faces/component/search/SearchExpressionContext;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
