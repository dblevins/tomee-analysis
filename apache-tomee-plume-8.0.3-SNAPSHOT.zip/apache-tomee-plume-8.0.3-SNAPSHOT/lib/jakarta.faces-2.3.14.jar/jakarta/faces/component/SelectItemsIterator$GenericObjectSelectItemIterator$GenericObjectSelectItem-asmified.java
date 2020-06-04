package asm.jakarta.faces.component;
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
public class SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItemDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", null, "jakarta/faces/model/SelectItem", null);

classWriter.visitInnerClass("jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator", "jakarta/faces/component/SelectItemsIterator", "GenericObjectSelectItemIterator", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator", "GenericObjectSelectItem", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("jakarta/faces/component/SelectItemsIterator$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VAR", "Ljava/lang/String;", null, "var");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ITEM_VALUE", "Ljava/lang/String;", null, "itemValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ITEM_LABEL", "Ljava/lang/String;", null, "itemLabel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ITEM_DESCRIPTION", "Ljava/lang/String;", null, "itemDescription");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ITEM_ESCAPED", "Ljava/lang/String;", null, "itemLabelEscaped");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ITEM_DISABLED", "Ljava/lang/String;", null, "itemDisabled");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NO_SELECTION_OPTION", "Ljava/lang/String;", null, "noSelectionOption");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemValue", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemLabel", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemDescription", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemEscaped", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemDisabled", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "noSelectionOption", "Ljakarta/el/ValueExpression;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "var", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sourceComponent", "Ljakarta/faces/component/UISelectItems;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljakarta/faces/component/UISelectItems;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/model/SelectItem", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UISelectItems", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitLdcInsn("var");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "sourceComponent", "Ljakarta/faces/component/UISelectItems;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "updateItem", "(Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/FacesContext", "getExternalContext", "()Ljakarta/faces/context/ExternalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/context/ExternalContext", "getRequestMap", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "sourceComponent", "Ljakarta/faces/component/UISelectItems;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/UISelectItems", "getAttributes", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("itemValue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("itemLabel");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("itemDescription");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("itemLabelEscaped");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("itemDisabled");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("noSelectionOption");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 1, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "java/lang/Object"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "setValue", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "setLabel", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "setDescription", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem"});
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "setEscape", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "setDisabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Ljava/lang/String;)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/util/Map", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object"}, 2, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "setNoSelectionOption", "(Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label17);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label18);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "var", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "jakarta/faces/context/FacesContext", "java/lang/Object", "java/util/Map", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeObject", "(Ljava/io/ObjectOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/NotSerializableException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/NotSerializableException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readObject", "(Ljava/io/ObjectInputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/io/NotSerializableException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/NotSerializableException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljakarta/faces/component/UISelectItems;Ljakarta/faces/component/SelectItemsIterator$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "<init>", "(Ljakarta/faces/component/UISelectItems;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Ljakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem;Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/SelectItemsIterator$GenericObjectSelectItemIterator$GenericObjectSelectItem", "updateItem", "(Ljakarta/faces/context/FacesContext;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
