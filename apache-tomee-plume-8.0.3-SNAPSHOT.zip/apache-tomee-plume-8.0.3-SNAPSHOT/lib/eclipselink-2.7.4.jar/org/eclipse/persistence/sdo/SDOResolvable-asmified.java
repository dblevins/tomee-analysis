package asm.org.eclipse.persistence.sdo;
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
public class SDOResolvableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/SDOResolvable", null, "java/lang/Object", new String[] { "commonj/sdo/impl/ExternalizableDelegator$Resolvable" });

classWriter.visitInnerClass("commonj/sdo/impl/ExternalizableDelegator$Resolvable", "commonj/sdo/impl/ExternalizableDelegator", "Resolvable", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(2807334877368539299L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ROOT_ELEMENT_NAME", "Ljava/lang/String;", null, "dataObject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_HELPER_CONTEXT_ID_IDENTIFIER", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_ROOT_OBJECT_IDENTIFIER", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SDO_INTERNAL_OBJECT_IDENTIFIER", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "aHelperContext", "Lcommonj/sdo/helper/HelperContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sdo/helper/SDOHelperContext", "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readResolve", "()Ljava/lang/Object;", null, new String[] { "java/io/ObjectStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeExternal", "(Ljava/io/ObjectOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "getContainer", "()Lorg/eclipse/persistence/sdo/SDODataObject;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sdo/helper/SDOHelperContext;"));
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/SDOHelperContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/SDOHelperContext", "getIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/zip/GZIPOutputStream", "java/io/ByteArrayOutputStream", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeUTF", "(Ljava/lang/String;)V", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeByte", "(I)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/zip/GZIPOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/zip/GZIPOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitLdcInsn("commonj.sdo");
methodVisitor.visitLdcInsn("sdo:dataObject");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/XMLHelper", "createDocument", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/helper/XMLDocument;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/SDOXMLHelper");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sdo/helper/SDOXMLHelper", "serialize", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/OutputStream;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPOutputStream", "finish", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPOutputStream", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeInt", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "write", "([B)V", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectOutput", "java/util/zip/GZIPOutputStream", "java/io/ByteArrayOutputStream"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectOutput", "java/util/zip/GZIPOutputStream", "java/io/ByteArrayOutputStream", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectOutput", "java/util/zip/GZIPOutputStream", "java/io/ByteArrayOutputStream"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "close", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeByte", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "_getPath", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeUTF", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "getRootObject", "()Lorg/eclipse/persistence/sdo/SDODataObject;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectOutput", "writeObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readExternal", "(Ljava/io/ObjectInput;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, null);
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label3, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "read", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTableSwitchInsn(0, 2, label5, new Label[] { label4, label0, label2 });
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/io/ByteArrayInputStream", "java/util/zip/GZIPInputStream", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readUTF", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readObject", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/SDODataObject", "get", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readInt", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readFully", "([B)V", true);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/zip/GZIPInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/zip/GZIPInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/XMLHelper", "load", "(Ljava/io/InputStream;)Lcommonj/sdo/helper/XMLDocument;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/XMLDocument", "getRootObject", "()Lcommonj/sdo/DataObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPInputStream", "close", "()V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectInput", "java/io/ByteArrayInputStream", "java/util/zip/GZIPInputStream", Opcodes.INTEGER, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayInputStream", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectInput", "java/io/ByteArrayInputStream", "java/util/zip/GZIPInputStream", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPInputStream", "close", "()V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayInputStream", "close", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readUTF", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readInt", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/ObjectInput", "readFully", "([B)V", true);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/zip/GZIPInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/zip/GZIPInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sdo/helper/SDOHelperContext", "getHelperContext", "(Ljava/lang/String;)Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/XMLHelper", "load", "(Ljava/io/InputStream;)Lcommonj/sdo/helper/XMLDocument;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/XMLDocument", "getRootObject", "()Lcommonj/sdo/DataObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/SDODataObject");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "theSDODataObject", "Lorg/eclipse/persistence/sdo/SDODataObject;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPInputStream", "close", "()V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectInput", "java/io/ByteArrayInputStream", "java/util/zip/GZIPInputStream", Opcodes.INTEGER, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayInputStream", "close", "()V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/sdo/SDOResolvable", "java/io/ObjectInput", "java/io/ByteArrayInputStream", "java/util/zip/GZIPInputStream", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/zip/GZIPInputStream", "close", "()V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayInputStream", "close", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHelperContext", "(Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/SDOResolvable", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}