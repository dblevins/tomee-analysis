package asm.org.eclipse.persistence.oxm.record;
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
public class XMLRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/oxm/record/XMLRecord", "Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord<Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/oxm/XMLMarshaller;Lorg/eclipse/persistence/oxm/NamespaceResolver;>;Lorg/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord<Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/oxm/XMLUnmarshaller;>;", "org/eclipse/persistence/internal/sessions/AbstractRecord", new String[] { "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "org/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/record/XMLRecord$Nil", "org/eclipse/persistence/internal/oxm/record/XMLRecord", "Nil", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "unmarshaller", "Lorg/eclipse/persistence/oxm/XMLUnmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "docPresPolicy", "Lorg/eclipse/persistence/oxm/documentpreservation/DocumentPreservationPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "currentObject", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "hasCustomNamespaceMapper", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "equalNamespaceResolvers", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord<Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/oxm/XMLMarshaller;Lorg/eclipse/persistence/oxm/NamespaceResolver;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NIL", "Lorg/eclipse/persistence/internal/oxm/record/XMLRecord$Nil;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/oxm/record/XMLRecord", "NIL", "Lorg/eclipse/persistence/internal/oxm/record/XMLRecord$Nil;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/oxm/record/XMLRecord", "NIL", "Lorg/eclipse/persistence/internal/oxm/record/XMLRecord$Nil;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/AbstractRecord", "<init>", "(Ljava/util/Vector;Ljava/util/Vector;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "equalNamespaceResolvers", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecordImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecordImpl", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "get", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "put", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "attributeWithoutQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getNamespaceSeparator", "()C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "attribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "attribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/oxm/XMLConstants", "ATTRIBUTE", "Ljava/lang/Character;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "setNamespaceResolver", "(Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "getLastXPathFragment", "()Lorg/eclipse/persistence/internal/oxm/XPathFragment;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "setNamespaceURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "add", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "namespaceDeclaration", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/NamespaceResolver", "resolveNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("@xmlns:");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "setNamespaceResolver", "(Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLField", "getXPathFragment", "()Lorg/eclipse/persistence/internal/oxm/XPathFragment;", false);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "setNamespaceURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "add", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocalName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespaceURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clear", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDocument", "()Lorg/w3c/dom/Document;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "values", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDOM", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "transformToXML", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "convertToXMLField", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)Lorg/eclipse/persistence/oxm/XMLField;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassCastException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassCastException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseField", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "convertToXMLField", "(Ljava/util/List;)Ljava/util/List;", "(Ljava/util/List<Lorg/eclipse/persistence/internal/helper/DatabaseField;>;)Ljava/util/List<Lorg/eclipse/persistence/oxm/XMLField;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassCastException");
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/oxm/record/XMLRecord", "java/util/List", "java/util/ArrayList", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/oxm/record/XMLRecord", "java/util/List", "java/util/ArrayList", "org/eclipse/persistence/internal/helper/DatabaseField", "java/util/Iterator"}, 1, new Object[] {"java/lang/ClassCastException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseField", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/oxm/record/XMLRecord", "java/util/List", "java/util/ArrayList", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getIndicatingNoEntry", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIndicatingNoEntry", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLField", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getIndicatingNoEntry", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveNamespacePrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "resolveNamespacePrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMarshaller", "()Lorg/eclipse/persistence/oxm/XMLMarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "getMarshaller", "()Lorg/eclipse/persistence/internal/oxm/Marshaller;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLMarshaller");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMarshaller", "(Lorg/eclipse/persistence/oxm/XMLMarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "setMarshaller", "(Lorg/eclipse/persistence/internal/oxm/Marshaller;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUnmarshaller", "()Lorg/eclipse/persistence/oxm/XMLUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "unmarshaller", "Lorg/eclipse/persistence/oxm/XMLUnmarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "unmarshaller", "Lorg/eclipse/persistence/oxm/XMLUnmarshaller;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDocPresPolicy", "(Lorg/eclipse/persistence/oxm/documentpreservation/DocumentPreservationPolicy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "docPresPolicy", "Lorg/eclipse/persistence/oxm/documentpreservation/DocumentPreservationPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDocPresPolicy", "()Lorg/eclipse/persistence/oxm/documentpreservation/DocumentPreservationPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "docPresPolicy", "Lorg/eclipse/persistence/oxm/documentpreservation/DocumentPreservationPolicy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOwningObject", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "getOwningObject", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOwningObject", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "setOwningObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCurrentObject", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCurrentObject", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "currentObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLeafElementType", "()Lorg/eclipse/persistence/internal/oxm/XPathQName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "getLeafElementType", "()Lorg/eclipse/persistence/internal/oxm/XPathQName;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLeafElementType", "(Lorg/eclipse/persistence/internal/oxm/XPathQName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "setLeafElementType", "(Lorg/eclipse/persistence/internal/oxm/XPathQName;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLeafElementType", "(Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "setLeafElementType", "(Ljavax/xml/namespace/QName;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNamespaceResolver", "(Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "setNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/NamespaceResolver");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSession", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEqualNamespaceResolvers", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "equalNamespaceResolvers", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasEqualNamespaceResolvers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "equalNamespaceResolvers", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isXOPPackage", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "isXOPPackage", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXOPPackage", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "setXOPPackage", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNamespaceAware", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "isNamespaceAware", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceSeparator", "()C", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasCustomNamespaceMapper", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "hasCustomNamespaceMapper", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCustomNamespaceMapper", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "hasCustomNamespaceMapper", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addExtraNamespacesToNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ZZ)Ljava/util/List;", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ZZ)Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/Namespace;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "addExtraNamespacesToNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ZZ)Ljava/util/List;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addXsiTypeAndClassIndicatorIfRequired", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "addXsiTypeAndClassIndicatorIfRequired", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Z)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addXsiTypeAndClassIndicatorIfRequired", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Ljava/lang/Object;ZZ)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "addXsiTypeAndClassIndicatorIfRequired", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Ljava/lang/Object;ZZ)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeExtraNamespacesFromNamespaceResolver", "(Ljava/util/List;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", "(Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/Namespace;>;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "removeExtraNamespacesFromNamespaceResolver", "(Ljava/util/List;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeXsiTypeAttribute", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "writeXsiTypeAttribute", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeXsiTypeAttribute", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/oxm/schema/XMLSchemaReference;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "abstractMarshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord", "writeXsiTypeAttribute", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/oxm/schema/XMLSchemaReference;Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConversionManager", "()Lorg/eclipse/persistence/internal/oxm/ConversionManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/XMLRecord", "session", "Lorg/eclipse/persistence/internal/sessions/AbstractSession;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getDatasourcePlatform", "()Lorg/eclipse/persistence/internal/databaseaccess/Platform;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/databaseaccess/Platform", "getConversionManager", "()Lorg/eclipse/persistence/internal/helper/ConversionManager;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/ConversionManager");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setMarshaller", "(Lorg/eclipse/persistence/internal/oxm/Marshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLMarshaller");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "setMarshaller", "(Lorg/eclipse/persistence/oxm/XMLMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getMarshaller", "()Lorg/eclipse/persistence/internal/oxm/Marshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getMarshaller", "()Lorg/eclipse/persistence/oxm/XMLMarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "put", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setSession", "(Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/sessions/AbstractSession");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "setSession", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/oxm/NamespaceResolver;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/NamespaceResolver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "setNamespaceResolver", "(Lorg/eclipse/persistence/oxm/NamespaceResolver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/DatabaseField");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "get", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getUnmarshaller", "()Lorg/eclipse/persistence/internal/oxm/Unmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getUnmarshaller", "()Lorg/eclipse/persistence/oxm/XMLUnmarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSession", "()Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/XMLRecord", "getSession", "()Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
