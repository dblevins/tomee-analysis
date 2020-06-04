package asm.org.yaml.snakeyaml.representer;
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
public class SafeRepresenterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/yaml/snakeyaml/representer/SafeRepresenter", null, "org/yaml/snakeyaml/representer/BaseRepresenter", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentUuid", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentUuid", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentByteArray", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentByteArray", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentEnum", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentEnum", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentDate", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentDate", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentSet", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentSet", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentMap", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentPrimitiveArray", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentPrimitiveArray", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentArray", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentArray", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$IteratorWrapper", "org/yaml/snakeyaml/representer/SafeRepresenter", "IteratorWrapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentIterator", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentIterator", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentList", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentList", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentNumber", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentNumber", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentBoolean", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentBoolean", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentString", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentNull", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentNull", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "classTags", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class<+Ljava/lang/Object;>;Lorg/yaml/snakeyaml/nodes/Tag;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "timeZone", "Ljava/util/TimeZone;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "MULTILINE_PATTERN", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/BaseRepresenter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentNull");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentNull", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "nullRepresenter", "Lorg/yaml/snakeyaml/representer/Represent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentBoolean", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentString", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/UUID;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentUuid");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentUuid", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentByteArray");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentByteArray", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentPrimitiveArray");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentPrimitiveArray", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[S"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[I"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[J"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[F"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[D"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[C"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "representers", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("[Z"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Number;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentNumber");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentNumber", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentList", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Set;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentSet", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Iterator;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentIterator", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentArray");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentArray", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Date;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentDate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentDate", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Enum;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentEnum", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "multiRepresenters", "Ljava/util/Map;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Calendar;"));
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentDate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentDate", "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "classTags", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getTag", "(Ljava/lang/Class;Lorg/yaml/snakeyaml/nodes/Tag;)Lorg/yaml/snakeyaml/nodes/Tag;", "(Ljava/lang/Class<*>;Lorg/yaml/snakeyaml/nodes/Tag;)Lorg/yaml/snakeyaml/nodes/Tag;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "classTags", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "classTags", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/Tag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addClassTag", "(Ljava/lang/Class;Lorg/yaml/snakeyaml/nodes/Tag;)Lorg/yaml/snakeyaml/nodes/Tag;", "(Ljava/lang/Class<+Ljava/lang/Object;>;Lorg/yaml/snakeyaml/nodes/Tag;)Lorg/yaml/snakeyaml/nodes/Tag;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Tag must be provided.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "classTags", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/nodes/Tag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTimeZone", "()Ljava/util/TimeZone;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTimeZone", "(Ljava/util/TimeZone;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter", "timeZone", "Ljava/util/TimeZone;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("\n|\u0085|\u2028|\u2029");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/representer/SafeRepresenter", "MULTILINE_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
