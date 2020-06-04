package asm.org.eclipse.persistence.jaxb.dynamic;
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
public class DynamicJAXBContext$SessionsXmlContextInputDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", null, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput", null);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/JAXBContext$JAXBContextState", "org/eclipse/persistence/jaxb/JAXBContext", "JAXBContextState", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput", "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext", "DynamicJAXBContextInput", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState", "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext", "DynamicJAXBContextState", ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext", "SessionsXmlContextInput", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sessions", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextInput", "<init>", "(Ljava/util/Map;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "sessions", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createContextState", "()Lorg/eclipse/persistence/jaxb/JAXBContext$JAXBContextState;", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "classLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/dynamic/DynamicClassLoader");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState", "<init>", "(Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/util/StringTokenizer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "sessions", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/StringTokenizer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/StringTokenizer", "countTokens", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sessions/factories/XMLSessionConfigLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/factories/XMLSessionConfigLoader", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState", "java/util/StringTokenizer", "java/util/ArrayList", "org/eclipse/persistence/sessions/factories/XMLSessionConfigLoader"}, 0, new Object[] {});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/factories/SessionManager", "getManager", "()Lorg/eclipse/persistence/sessions/factories/SessionManager;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/StringTokenizer", "nextToken", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "classLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sessions/factories/SessionManager", "getSession", "(Lorg/eclipse/persistence/sessions/factories/XMLSessionConfigLoader;Ljava/lang/String;Ljava/lang/ClassLoader;ZZ)Lorg/eclipse/persistence/internal/sessions/AbstractSession;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sessions/DatabaseSession");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/sessions/DatabaseSession", "getProject", "()Lorg/eclipse/persistence/sessions/Project;", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "classLoader", "Ljava/lang/ClassLoader;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/dynamic/DynamicClassLoader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/dynamic/DynamicTypeBuilder", "loadDynamicProject", "(Lorg/eclipse/persistence/sessions/Project;Lorg/eclipse/persistence/sessions/DatabaseLogin;Lorg/eclipse/persistence/dynamic/DynamicClassLoader;)Lorg/eclipse/persistence/sessions/Project;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/StringTokenizer", "hasMoreTokens", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLContext", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState", "setXMLContext", "(Lorg/eclipse/persistence/oxm/XMLContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLContext", "getSessions", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$SessionsXmlContextInput", "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState", "java/util/StringTokenizer", "java/util/ArrayList", "org/eclipse/persistence/sessions/factories/XMLSessionConfigLoader", "org/eclipse/persistence/oxm/XMLContext", "java/util/List", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/dynamic/DynamicJAXBContext$DynamicJAXBContextState", "getHelpers", "()Ljava/util/ArrayList;", false);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/dynamic/DynamicHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sessions/DatabaseSession");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/dynamic/DynamicHelper", "<init>", "(Lorg/eclipse/persistence/sessions/DatabaseSession;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
