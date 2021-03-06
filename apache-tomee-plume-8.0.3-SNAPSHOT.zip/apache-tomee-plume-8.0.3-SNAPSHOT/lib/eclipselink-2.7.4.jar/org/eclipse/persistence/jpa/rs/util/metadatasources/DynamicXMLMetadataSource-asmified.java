package asm.org.eclipse.persistence.jpa.rs.util.metadatasources;
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
public class DynamicXMLMetadataSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", null, "java/lang/Object", new String[] { "org/eclipse/persistence/jaxb/metadata/MetadataSource" });

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/xmlmodel/JavaType$JavaAttributes", "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "JavaAttributes", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "JavaTypes", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "setPackageName", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings", "setJavaTypes", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getProject", "()Lorg/eclipse/persistence/sessions/Project;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/Project", "getOrderedDescriptors", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "org/eclipse/persistence/internal/sessions/AbstractSession", "java/lang/String", "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/ClassDescriptor");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(I)I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "org/eclipse/persistence/internal/sessions/AbstractSession", "java/lang/String", "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "org/eclipse/persistence/descriptors/ClassDescriptor", "java/util/Iterator", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", "getJavaType", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "createJAXBType", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/jaxb/xmlmodel/ObjectFactory;)Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "org/eclipse/persistence/internal/sessions/AbstractSession", "java/lang/String", "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "org/eclipse/persistence/jaxb/xmlmodel/XmlBindings$JavaTypes", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createJAXBType", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/jaxb/xmlmodel/ObjectFactory;)Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/JavaType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getAlias", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/jaxb/xmlmodel/JavaType", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "setName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/JavaType$JavaAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType$JavaAttributes", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "setJavaAttributes", "(Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType$JavaAttributes;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/dynamic/DynamicEntity;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getMappings", "()Ljava/util/Vector;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "org/eclipse/persistence/descriptors/ClassDescriptor", "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "java/lang/String", Opcodes.INTEGER, Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/DatabaseMapping");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "createJAXBProperty", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/jaxb/xmlmodel/ObjectFactory;Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType;Z)Ljakarta/xml/bind/JAXBElement;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "getJavaAttributes", "()Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType$JavaAttributes;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType$JavaAttributes", "getJavaAttribute", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "isAggregateDescriptor", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "org/eclipse/persistence/descriptors/ClassDescriptor", "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "java/lang/String", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/weaving/RestAdapterClassWriter", "constructClassNameForReferenceAdapter", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter", "setValue", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter", "setValueType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter", "setType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "setXmlJavaTypeAdapter", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createJAXBProperty", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/jaxb/xmlmodel/ObjectFactory;Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType;Z)Ljakarta/xml/bind/JAXBElement;", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/jaxb/xmlmodel/ObjectFactory;Lorg/eclipse/persistence/jaxb/xmlmodel/JavaType;Z)Ljakarta/xml/bind/JAXBElement<Lorg/eclipse/persistence/jaxb/xmlmodel/XmlElement;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeAccessor", "()Lorg/eclipse/persistence/mappings/AttributeAccessor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/AttributeAccessor", "isVirtualAttributeAccessor", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setJavaAttribute", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "isObjectReferenceMapping", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/ObjectReferenceMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/ObjectReferenceMapping", "getReferenceClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setType", "(Ljava/lang/String;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/jaxb/xmlmodel/XmlElement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "isCollectionMapping", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "isEISMapping", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/eis/mappings/EISCompositeDirectCollectionMapping");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/eis/mappings/EISCompositeDirectCollectionMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/mappings/EISCompositeDirectCollectionMapping", "getContainerPolicy", "()Lorg/eclipse/persistence/internal/queries/ContainerPolicy;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/queries/ContainerPolicy", "getContainerClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setContainerType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/eis/mappings/EISCompositeCollectionMapping");
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/eis/mappings/EISCompositeCollectionMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/mappings/EISCompositeCollectionMapping", "getContainerPolicy", "()Lorg/eclipse/persistence/internal/queries/ContainerPolicy;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/queries/ContainerPolicy", "getContainerClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setContainerType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/eis/mappings/EISCompositeCollectionMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/eis/mappings/EISCompositeCollectionMapping", "getReferenceClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/CollectionMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/CollectionMapping", "getReferenceClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setType", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/CollectionMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/CollectionMapping", "getContainerPolicy", "()Lorg/eclipse/persistence/internal/queries/ContainerPolicy;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/queries/ContainerPolicy", "getContainerClassName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setContainerType", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeClassification", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setType", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeAccessor", "()Lorg/eclipse/persistence/mappings/AttributeAccessor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/AttributeAccessor", "isVirtualAttributeAccessor", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeAccessor", "()Lorg/eclipse/persistence/mappings/AttributeAccessor;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "getXmlVirtualAccessMethods", "()Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor", "getGetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods", "setGetMethod", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor", "getSetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods", "setSetMethod", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "setXmlVirtualAccessMethods", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/JavaType", "getXmlVirtualAccessMethods", "()Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethods", "getGetMethod", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor", "getGetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlAccessMethods");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlAccessMethods", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor", "getGetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlAccessMethods", "setGetMethod", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/VirtualAttributeAccessor", "getSetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlAccessMethods", "setSetMethod", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlElement", "setXmlAccessMethods", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAccessMethods;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/ObjectFactory", "createXmlElement", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlElement;)Ljakarta/xml/bind/JAXBElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlBindings", "(Ljava/util/Map;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", "(Ljava/util/Map<Ljava/lang/String;*>;Ljava/lang/ClassLoader;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/rs/util/metadatasources/DynamicXMLMetadataSource", "xmlBindings", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlBindings;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
