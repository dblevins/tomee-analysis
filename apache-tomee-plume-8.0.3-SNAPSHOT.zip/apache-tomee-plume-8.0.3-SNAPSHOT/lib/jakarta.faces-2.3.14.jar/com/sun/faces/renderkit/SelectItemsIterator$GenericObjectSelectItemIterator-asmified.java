package asm.com.sun.faces.renderkit;
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
public class SelectItemsIterator$GenericObjectSelectItemIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "Ljava/lang/Object;Lcom/sun/faces/renderkit/SelectItemsIterator$ComponentAwareSelectItemIterator<Ljakarta/faces/model/SelectItem;>;", "java/lang/Object", new String[] { "com/sun/faces/renderkit/SelectItemsIterator$ComponentAwareSelectItemIterator" });

classWriter.visitInnerClass("com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "com/sun/faces/renderkit/SelectItemsIterator", "GenericObjectSelectItemIterator", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "GenericObjectSelectItem", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/renderkit/SelectItemsIterator$ComponentAwareSelectItemIterator", "com/sun/faces/renderkit/SelectItemsIterator", "ComponentAwareSelectItemIterator", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("com/sun/faces/renderkit/SelectItemsIterator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "genericObjectSI", "Lcom/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "sourceComponent", "Ljakarta/faces/component/UISelectItems;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljakarta/faces/component/UISelectItems;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "sourceComponent", "Ljakarta/faces/component/UISelectItems;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentSelectComponent", "()Ljakarta/faces/component/UIComponent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "sourceComponent", "Ljakarta/faces/component/UISelectItems;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSelectItemFor", "(Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)Ljakarta/faces/model/SelectItem;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "genericObjectSI", "Lcom/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "sourceComponent", "Ljakarta/faces/component/UISelectItems;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "<init>", "(Ljakarta/faces/component/UISelectItems;Lcom/sun/faces/renderkit/SelectItemsIterator$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "genericObjectSI", "Lcom/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "genericObjectSI", "Lcom/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "access$600", "(Lcom/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator", "genericObjectSI", "Lcom/sun/faces/renderkit/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
